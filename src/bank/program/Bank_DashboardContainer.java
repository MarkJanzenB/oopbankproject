
package bank.program;

import PersistenceLayer.DatabaseImplementations;
import bank.SecurityComponents.UserPINUpdate;
import bank.classes.UserAccount;
import bank.program.dashboard.Components.Dashboard;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class Bank_DashboardContainer extends javax.swing.JFrame {
    private UserAccount user;
    private JPanel balancePanel;
    private JPanel sendMoneyBalancePanel;
    private JLabel utilityBillsIcon;
    private JLabel securityIcon;
    private JLabel transferMoneyIcon;
    private JLabel customerSupportIcon;
    private JTextField sendMoneyRecepient;
    private JTextField sendMoneyAmount;
    private JButton sendMoneyBTN;
    private JPasswordField updatePinOld;
    private JPasswordField updatePinNew;
    private JButton updatePinBTN;
    private Bank_PayBillContainer pay_dashboard;
    private DatabaseImplementations database;

    public Bank_DashboardContainer(){
        initComponents();
        initComponentsListeners();
    }
    
public Bank_DashboardContainer(UserAccount user) {
    initComponents();
    initComponentsListeners();
    userPINUpdate.setUser(user);
    dashboard1.setUser(user);
    accountDetails1.setUser(user);
    sendMoney1.setUser(user);
    sendMoney1.setDatabase(new DatabaseImplementations());
    pay_dashboard = new Bank_PayBillContainer(user);
    pay_dashboard.setDashboard(this);
    database = new DatabaseImplementations();
    
    this.user = user; // Add this line to assign the user object
}
    
    public void setDatabase(DatabaseImplementations database) {
        this.database = database;
        pay_dashboard.setDatabase(database);
    }
    
    private void hideDashboard(){
           this.setVisible(false);
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashboard1 = new bank.program.dashboard.Components.Dashboard();
        accountDetails1 = new bank.program.dashboard.Components.AccountDetails();
        sendMoney1 = new bank.program.dashboard.Components.SendMoney();
        customerSupport1 = new bank.program.dashboard.Components.CustomerSupport();
        userPINUpdate = new bank.SecurityComponents.UserPINUpdate();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(backIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        jTabbedPane1.addTab("tab0", dashboard1);
        jTabbedPane1.addTab("tab2", accountDetails1);
        jTabbedPane1.addTab("tab3", sendMoney1);

        customerSupport1.setName(""); // NOI18N
        jTabbedPane1.addTab("tab4", customerSupport1);
        jTabbedPane1.addTab("tab5", userPINUpdate);

        MainPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1190, 670));
        jTabbedPane1.getAccessibleContext().setAccessibleName("tab6");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public void updateBalance() {
        int userUID = user.getAccountnum();
        double updatedBalance = database.getBalance(userUID);
        user.setBalance(updatedBalance);

        // Assuming you have a method in your SendMoney component to update the displayed balance
        sendMoney1.setBalanceValue(String.valueOf(updatedBalance));
        dashboard1.setBalanceValue(String.valueOf(updatedBalance));
        
        
        
    }
    private void initComponentsListeners(){
        
        backIcon.setVisible(false);
        backIcon.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
                if(jTabbedPane1.getSelectedIndex() != 0){
                    backIcon.setVisible(false);
                    jTabbedPane1.setSelectedIndex(0);

                }
                    updateBalance();
            }  
        });
        
     
                    
      balancePanel = new JPanel();
      balancePanel = dashboard1.getBalancePanel();
      balancePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               jTabbedPane1.setSelectedIndex(1);
                backIcon.setVisible(true);

            }
      });

      
      utilityBillsIcon = new JLabel();
      utilityBillsIcon = dashboard1.getUtilityBillsIcon();
      utilityBillsIcon.addMouseListener(new MouseAdapter() {
          
        public void mouseClicked(MouseEvent e) {
                    pay_dashboard.setVisible(true);     
                    hideDashboard();
            }  
        });
      
                

      securityIcon = new JLabel();
      securityIcon = dashboard1.getSecurityIcon();
      securityIcon.addMouseListener(new MouseAdapter() {
          @Override
        public void mouseClicked(MouseEvent e) {
                jTabbedPane1.setSelectedIndex(4);
                backIcon.setVisible(true);
            }
        
        });
      updatePinOld = new JPasswordField();
      updatePinOld = userPINUpdate.getPinTF();
      updatePinNew = new JPasswordField();
      updatePinNew = userPINUpdate.getNewpinTF();
      updatePinBTN = new JButton();
      updatePinBTN = userPINUpdate.getDoneBTN();
      updatePinBTN.addActionListener(e -> {
        String oldPin = String.valueOf(updatePinOld.getPassword());
        String newPin = String.valueOf(updatePinNew.getPassword());
       if (oldPin.equals(user.getPin())) {
            // Current PIN is correct, update the PIN
            database.updatePin(user.getAccountnum(), newPin);
            JOptionPane.showMessageDialog(this, "User PIN Updated!");
            jTabbedPane1.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(this, "User PIN Incorrect, Please try again");
            // You might want to add some UI feedback or an error message here
        }

      });


  
      transferMoneyIcon = new JLabel();
      transferMoneyIcon = dashboard1.getTransferMoneyIcon();
      transferMoneyIcon.addMouseListener(new MouseAdapter() {
          @Override
        public void mouseClicked(MouseEvent e) {
                jTabbedPane1.setSelectedIndex(2);
                backIcon.setVisible(true);
            }  
        });
      
      customerSupportIcon = new JLabel();
      customerSupportIcon = dashboard1.getCustomerSupportIcon();
      customerSupportIcon.addMouseListener(new MouseAdapter() {
          @Override      
        public void mouseClicked(MouseEvent e) {
                jTabbedPane1.setSelectedIndex(3);
                backIcon.setVisible(true);
            }  
        });
      sendMoneyRecepient = new JTextField();
      sendMoneyRecepient = sendMoney1.getAccntTF();
      sendMoneyAmount = new JTextField();
      sendMoneyAmount = sendMoney1.getAmountTF();
      sendMoneyBTN = new JButton();
      sendMoneyBTN = sendMoney1.getSendMoneyBTN();
      
      
      sendMoneyBTN.addActionListener(e -> {
        String recipientAccountNumber = sendMoneyRecepient.getText();
        Double amount = Double.parseDouble(sendMoneyAmount.getText());

        // Assuming you have a method to retrieve UID by account number
        int recipientUID = database.getUIDByAccountNumber(sendMoneyRecepient.getText());

        if (recipientUID != -1) {
            // Get the current user's UID from the user object or wherever it is stored
            int senderUID = user.getAccountnum();
            // Call the sendMoney method from the DatabaseImplementations class
            database.sendMoney(senderUID, recipientUID, amount);
            
            // Update the UI or show a message indicating the success or failure of the transaction
//            user = database.getUpdatedDetails(user.getAccountnum());
            JOptionPane.showMessageDialog(this, "Money sent successfully!");
            updateBalance();

            
            
        } else {
            JOptionPane.showMessageDialog(this, "Invalid recipient account number!");
        }
      });
      
      
      
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }
    
    public UserAccount getUser() {
        return user;
    }
    
    public static void main(String[] args) {
        new Bank_DashboardContainer().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private bank.program.dashboard.Components.AccountDetails accountDetails1;
    private javax.swing.JLabel backIcon;
    private bank.program.dashboard.Components.CustomerSupport customerSupport1;
    private bank.program.dashboard.Components.Dashboard dashboard1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private bank.program.dashboard.Components.SendMoney sendMoney1;
    private bank.SecurityComponents.UserPINUpdate userPINUpdate;
    // End of variables declaration//GEN-END:variables
}
