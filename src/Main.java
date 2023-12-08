
import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import bank.program.Bank_LogIn;

public class Main {

    public static void main(String[] args) {
        UserAccount user = new UserAccount();
        DatabaseImplementations dao = new DatabaseImplementations(user);
        new Bank_LogIn(user, dao).setVisible(true);
    }
    
}
