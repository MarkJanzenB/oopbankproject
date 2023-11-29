
import PersistenceLayer.DAOImplementations;
import bank.classes.UserAccount;
import bank.program.Bank_LogIn;

public class Main {

    public static void main(String[] args) {
        UserAccount user = new UserAccount();
        DAOImplementations dao = new DAOImplementations(user);
        new Bank_LogIn(user, dao).setVisible(true);
    }
    
}
