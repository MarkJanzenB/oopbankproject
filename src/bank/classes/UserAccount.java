
package bank.classes;

public class UserAccount extends UserDetails{
    
    private int accountnum;
    private String pin;
    private String mobileNumber;
    private String email;
    private String password;
    private Double balance=1000.00;

    public UserAccount(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
    public UserAccount() {
    }
    

    public String getmobileNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(String phoneNumber) {
        this.mobileNumber = phoneNumber;
    }


    public String getPin() {
        return pin;
    }

    public int getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(int accountnum) {
        this.accountnum = accountnum;
    }
    
    
    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
