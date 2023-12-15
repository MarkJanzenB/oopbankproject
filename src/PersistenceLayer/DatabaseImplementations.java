package PersistenceLayer;

import bank.classes.UserAccount;
import bank.program.dashboard.Components.AccountDetails;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DatabaseImplementations implements DatabaseInterface{
    
    private UserAccount user;
    private String url = "jdbc:mysql://localhost:3306/oopbank";
    private String userName = "root";   
    private String passWord = "";
    private Connection con; 

    public DatabaseImplementations() {
    }
    
    
      public void sendMoney(int senderUID, int recipientUID, double amount) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, userName, passWord);
            con.setAutoCommit(false);

            // Fetch sender and recipient information
            UserAccount sender = getUserByUID(con, senderUID);
            UserAccount recipient = getUserByUID(con, recipientUID);

            // Check if sender has sufficient balance
            if (sender.getBalance() >= amount) {
                // Deduct the amount from sender's balance
                double newSenderBalance = sender.getBalance() - amount;
                updateBalance(con, senderUID, newSenderBalance);

                // Add the amount to recipient's balance
                double newRecipientBalance = recipient.getBalance() + amount;
                updateBalance(con, recipientUID, newRecipientBalance);

                // Record the transaction in the 'transactions' table
                recordTransaction(con, senderUID, recipientUID, amount, "SEND", "Money sent to UID: " + recipientUID);

                // Commit the transaction
                con.commit();
            } else {
                System.out.println("Insufficient balance");
                // You may want to throw an exception or handle the insufficient balance scenario accordingly
            }
        } catch (SQLException e) {
            // Handle exceptions, rollback the transaction, and/or log errors
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException rollbackException) {
                    rollbackException.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block to ensure it's closed even if an exception occurs
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException closeException) {
                    closeException.printStackTrace();
                }
            }
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
       

        private void updateBalance(Connection con, int uid, double newBalance) throws SQLException {
            String updateQuery = "UPDATE users SET balance = ? WHERE UID = ?";
            try (PreparedStatement st = con.prepareStatement(updateQuery)) {
                st.setDouble(1, newBalance);
                st.setInt(2, uid);
                st.executeUpdate();
            }
    }

    private void recordTransaction(Connection con, int senderUID, int recipientUID, double amount, String transType, String transDesc) throws SQLException {
        String insertQuery = "INSERT INTO transactions (transDate, transAmt, transType, transDesc, UID) VALUES (CURDATE(), ?, ?, ?, ?)";
        try (PreparedStatement st = con.prepareStatement(insertQuery)) {
            st.setDouble(1, amount);
            st.setString(2, transType);
            st.setString(3, transDesc);
            st.setInt(4, senderUID);
            st.executeUpdate();
        }
    }
    
    public void recordTransactionBills(int senderUID, String biller, double amount, String transType, String transDesc) throws SQLException {
        String insertQuery = "INSERT INTO transactions (transDate, transAmt, transType, transDesc, UID) VALUES (CURDATE(), ?, ?, ?, ?)";
            try (Connection con = DriverManager.getConnection(url, userName, passWord);
        PreparedStatement st = con.prepareStatement(insertQuery)) {
            
            st.setDouble(1, amount);
            st.setString(2, transType);
            st.setString(3, transDesc);
            st.setInt(4, senderUID);
            st.executeUpdate();
        }
        
    }
    
    public void updateUserBalance(int uid, double newBalance) throws SQLException{
        String updateQuery = "UPDATE users SET balance = ? WHERE UID = ?";
            try (Connection con = DriverManager.getConnection(url, userName, passWord);
                 PreparedStatement st = con.prepareStatement(updateQuery)) {
                    st.setDouble(1, newBalance);
                    st.setInt(2, uid);
                    st.executeUpdate();
            }
    }
      
    public DatabaseImplementations(UserAccount user) {
        this.user = user;
    }
    

    public double getBalance(int uid) {
        String query = "SELECT balance FROM users WHERE UID = ?";

        try (Connection con = DriverManager.getConnection(url, userName, passWord);
             PreparedStatement st = con.prepareStatement(query)) {

            st.setInt(1, uid);

            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("balance");
                } else {
                    // Handle the case when the user with the given UID is not found
                    throw new RuntimeException("User not found with UID: " + uid);
                }
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions (e.g., log or rethrow)
            e.printStackTrace();
            throw new RuntimeException("Error while getting balance", e);
        }
    }
    
    @Override
    public void insertNewUser(UserAccount user) {
        String query = "INSERT INTO users("
                + "firstname, "
                + "lastname, "
                + "address, "
                + "phone_num, "
                + "pin_num, "
                + "email, "
                + "password, "
                + "balance) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                st.setString(1, user.getFirstname());
                st.setString(2, user.getLastname());
                st.setString(3, user.getAddress());
                st.setString(4, user.getmobileNumber());
                st.setString(5, user.getPin());
                st.setString(6, user.getEmail());
                st.setString(7, user.getPassword());
                st.setDouble(8, user.getBalance());
               
                st.executeUpdate();
                st.close();
                con.close();
        } catch (SQLException e) {
                System.out.println(e.getLocalizedMessage());
        }
    }

    @Override
    public UserAccount checkUserAndGetCredentials(String email, String password) {
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";
           try {
                   Connection con = DriverManager.getConnection(url, userName, passWord);
                   PreparedStatement st = con.prepareStatement(query);
                   st.setString(1, email);
                   st.setString(2, password);
                   
                   ResultSet rs = st.executeQuery();
                
                if(rs.next()){ 
                    // Check if the result set contains at least one row
                    user.setAccountnum(Integer.valueOf(rs.getString(("UID"))));
                    user.setFirstname(rs.getString("firstname"));
                    user.setLastname(rs.getString("lastname"));
                    user.setAddress(rs.getString("address"));
                    user.setmobileNumber(rs.getString("phone_num"));
                    user.setPin(rs.getString("pin_num"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setBalance(Double.valueOf(rs.getString("balance")));
                }
                else {
                    System.out.println("rs is null");
                    return null;
                }
                st.close();
                con.close();
        } catch (SQLException e) {
                System.out.println(e.getLocalizedMessage());
                return null;
        }
        
        return user;
    }
    
    public void updatePin(int uid, String newPin) {
    String updateQuery = "UPDATE users SET pin_num = ? WHERE UID = ?";
    try (Connection con = DriverManager.getConnection(url, userName, passWord);
         PreparedStatement st = con.prepareStatement(updateQuery)) {

        st.setString(1, newPin);
        st.setInt(2, uid);
        st.executeUpdate();
    } catch (SQLException e) {
        // Handle any SQL exceptions (e.g., log or rethrow)
        e.printStackTrace();
        throw new RuntimeException("Error while updating PIN", e);
    }
}
    public int getUIDByAccountNumber(String recipientAccountNumber) {
    String query = "SELECT UID FROM users WHERE UID = ?";
    
        try (Connection con = DriverManager.getConnection(url, userName, passWord);
            PreparedStatement st = con.prepareStatement(query)) {

            st.setString(1, recipientAccountNumber);

            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("UID");
                } else {
                    // Handle the case when the account number is not found
                    throw new RuntimeException("Invalid recipient account number!");
                }
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions (e.g., log or rethrow)
            e.printStackTrace();
            throw new RuntimeException("Error while getting UID by account number", e);
        }
    }
        public UserAccount getUserByUID(Connection con, int uid) throws SQLException {
            String query = "SELECT * FROM users WHERE UID = ?";
            try (PreparedStatement st = con.prepareStatement(query)) {
                st.setInt(1, uid);

                try (ResultSet rs = st.executeQuery()) {
                    if (rs.next()) {
                        UserAccount user = new UserAccount();
                        user.setAccountnum(Integer.valueOf(rs.getString("UID")));
                        user.setFirstname(rs.getString("firstname"));
                        user.setLastname(rs.getString("lastname"));
                        user.setAddress(rs.getString("address"));
                        user.setmobileNumber(rs.getString("phone_num"));
                        user.setPin(rs.getString("pin_num"));
                        user.setEmail(rs.getString("email"));
                        user.setPassword(rs.getString("password"));
                        user.setBalance(Double.valueOf(rs.getString("balance")));
                        return user;
                    }
                }
            }
            return null; // Return null if no user found with the given UID
        }
        
       public ArrayList<UserAccount> getAllUsers() {
                ArrayList<UserAccount> userList = new ArrayList<>();
                String query = "SELECT * FROM users";

                try (Connection con = DriverManager.getConnection(url, userName, passWord);
                     PreparedStatement st = con.prepareStatement(query);
                     ResultSet rs = st.executeQuery()) {

                    while (rs.next()) {
                        UserAccount user = new UserAccount();
                                user.setAccountnum(Integer.valueOf(rs.getString(("UID"))));
                                user.setFirstname(rs.getString("firstname"));
                                user.setLastname(rs.getString("lastname"));
                                user.setAddress(rs.getString("address"));
                                user.setmobileNumber(rs.getString("phone_num"));
                                user.setPin(rs.getString("pin_num"));
                                user.setEmail(rs.getString("email"));
                                user.setPassword(rs.getString("password"));
                                user.setBalance(Double.valueOf(rs.getString("balance")));
                        userList.add(user);
                    }
                } catch (SQLException ex) {
                    System.out.println("Error while fetching all users: " + ex.getMessage());
                }
                return userList;
}
        
        public int getNumberOfRows(){
           String query = "SELECT COUNT(*) AS total_rows FROM users";
           int totalUsers = 0;
              
            try {
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                
                //this will get the total number of rows in DB
                ResultSet rs = st.executeQuery();
                if(rs.next())
                    totalUsers = rs.getInt("total_rows");
            }
            catch(SQLException ex){
                 System.out.println("ERROR IN GETTING nmber of USERS");
            }
            return totalUsers;
        }
        
        public void deleteUser(String UID){
            String query = "DELETE FROM users WHERE UID = ?";
            try{
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                
                st.setInt(1, Integer.valueOf(UID));
                st.executeUpdate();
            }catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
}