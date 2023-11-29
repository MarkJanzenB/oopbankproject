
package PersistenceLayer;

import bank.classes.UserAccount;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public interface DAOInterface {
    
    void insertNewUser(UserAccount user);
    UserAccount checkUserAndGetCredentials(String email, String password);
}
