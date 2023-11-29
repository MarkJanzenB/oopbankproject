package PersistenceLayer;

import bank.classes.UserAccount;
import bank.program.dashboard.Components.AccountDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DAOImplementations implements DAOInterface{
    
    private UserAccount user;
    private DAOInterface dao;
    private String url = "jdbc:mysql://localhost:3306/bankoop";
    private String userName = "root";   
    private String passWord = "";

    public DAOImplementations() {
    }
   
    public DAOImplementations(UserAccount user) {
        this.user = user;
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
                st.setString(8, "0");
               
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
                    user.setFirstname(rs.getString("firstname"));
                    user.setLastname(rs.getString("lastname"));
                    user.setAddress(rs.getString("address"));
                    user.setmobileNumber(rs.getString("phone_num"));
                    user.setPin(rs.getString("pin_num"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setInitBalance();
                }
                else{
                    System.out.println("rs is null");
                    return null;
                }
                st.close();
                con.close();
        } catch (SQLException e) {
                System.out.println(e.getLocalizedMessage());
        }
        
        return user;
    }
    

   

}
