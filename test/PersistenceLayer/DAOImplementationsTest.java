package PersistenceLayer;

import bank.classes.UserAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class DAOImplementationsTest {
    
    public DAOImplementationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of insertNewUser method, of class DAOImplementations.
     */
    @Test
    public void testInsertNewUser() {
        System.out.println("insertNewUser");
        UserAccount user = null;
        DAOImplementations instance = new DAOImplementations();
        instance.insertNewUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserAndGetCredentials method, of class DAOImplementations.
     */
    @Test
    public void testCheckUserAndGetCredentials() {
        System.out.println("checkUserAndGetCredentials");
        String email = "mark@gmail.com";
        String password = "123456";
        DAOImplementations instance = new DAOImplementations();
        UserAccount expResult = null;
        UserAccount result = instance.checkUserAndGetCredentials(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
