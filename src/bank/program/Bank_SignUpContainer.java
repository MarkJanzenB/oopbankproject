
package bank.program;

import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import bank.program.SignUpComponents.Personal_Information;
import bank.program.dashboard.Components.Dashboard;
import bank.classes.BankSMS;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static okhttp3.CertificatePinner.pin;



public class Bank_SignUpContainer extends javax.swing.JFrame {
    
    private DatabaseImplementations dao; 
    private UserAccount user;
    private Bank_DashboardContainer dashboard;
    private JButton personlInfoBTN;
    private JButton secuirityBTN;
    private JButton otpBTN;
    private Bank_LogIn loginPanel;
    private JFrame frame;
    private JTextField OTPpinTF;
    private JTextField securityTF;
    private Random PinGenerator;
    private int otpPin;
    
    public Bank_SignUpContainer(DatabaseImplementations dao) {
        user = new UserAccount();
        this.dao = dao;
        initComponents();
        this.setResizable(false);
        personal_Information1.setUser(user);
        secuirity_Details2.setUser(user);
        
       //Button Logic for the Personal Details Panel
       personlInfoBTN = new JButton();
       personlInfoBTN = personal_Information1.getBtn_Next();
       personlInfoBTN.addActionListener(e ->{ 
            user.setFirstname(personal_Information1.getFirstnameTF().getText());
            user.setLastname(personal_Information1.getLastnameTF().getText());
            user.setmobileNumber(personal_Information1.getMobileNumberTF().getText());
            user.setAddress(personal_Information1.getAddressTF().getText());
            user.setEmail(personal_Information1.getEmailAddressTF().getText());
            user.setPassword(String.valueOf(personal_Information1.getPassTF().getPassword()));
            jTabbedPane1.setSelectedIndex(1);
       });
       
       //The Logic for the button of Security Panel
       secuirityBTN = new JButton();
       secuirityBTN = secuirity_Details2.getDoneBTN();
       secuirityBTN.addActionListener(e -> {     
            PinGenerator= new Random();
           if(otpPin == 0){
                otpPin = 100000 + PinGenerator.nextInt(900000);
                //incase the SMS will fail the pin can be retrieved in CLI
                System.out.println("OTP PIN IS: " + otpPin);
                
//                 COMMENT THIS FOR DEBUGGING ONLY, SMS ARE LIMITED!!
                new BankSMS(String.valueOf(otpPin), user.getmobileNumber()); 
                  securityTF = new JTextField();
                  securityTF = secuirity_Details2.getPinTF();
                  user.setPin(securityTF.getText());
                  jTabbedPane1.setSelectedIndex(2);
           }
           else{
                //incase the SMS will fail the pin can be retrieved in CLI
               System.out.println("Entered else block. otpPin value: " + otpPin);
               jTabbedPane1.setSelectedIndex(2);
           }

       });
       
       //This logic is for the OTP
        OTPpinTF = new JTextField();
        OTPpinTF = bankOTP1.getOtpField();
        otpBTN = new JButton();
        otpBTN = bankOTP1.getVerifyBtn();
        otpBTN.addActionListener(e -> {
             if (OTPpinTF.getText().equals(String.valueOf(otpPin))  ){
                dao.insertNewUser(user);
                user = dao.checkUserAndGetCredentials(user.getEmail(),user.getPassword());
                dashboard = new Bank_DashboardContainer(user);
                dashboard.setDatabase(new DatabaseImplementations());
                dashboard.setUser(user);
                dashboard.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "OTP invalid");
            }  
        });
        
        
        
        
       //This is for the back button
       backLabel.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
                if(jTabbedPane1.getSelectedIndex() == 0){
                    loginPanel = new Bank_LogIn(user, dao); 
                    loginPanel.setVisible(true);
                    dispose();
                }
                else{
                    jTabbedPane1.setSelectedIndex(0);
                }
            }  
        });
    
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        personal_Information1 = new bank.program.SignUpComponents.Personal_Information();
        secuirity_Details2 = new bank.program.SignUpComponents.Secuirity_Details();
        bankOTP1 = new bank.program.SignUpComponents.BankOTP();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addTab("tab3", personal_Information1);
        jTabbedPane1.addTab("tab2", secuirity_Details2);
        jTabbedPane1.addTab("tab3", bankOTP1);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -30, 820, 600));

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private bank.program.SignUpComponents.BankOTP bankOTP1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private bank.program.SignUpComponents.Personal_Information personal_Information1;
    private bank.program.SignUpComponents.Secuirity_Details secuirity_Details2;
    // End of variables declaration//GEN-END:variables
}
