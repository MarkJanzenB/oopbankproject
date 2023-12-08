
package PersistenceLayer;

import bank.classes.UserAccount;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public interface DatabaseInterface {
    
    void insertNewUser(UserAccount user);
    UserAccount checkUserAndGetCredentials(String email, String password);
    boolean checkConnection(Connection con) throws SQLException;

}
