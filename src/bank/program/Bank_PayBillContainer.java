
package bank.program;

import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import bank.program.dashboard.Components.Dashboard;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Bank_PayBillContainer extends javax.swing.JFrame {
    private DatabaseImplementations database;
    private UserAccount user;
    private Bank_DashboardContainer dashboard;
    private JLabel electricityBill;
    private JLabel waterBill;
    private JLabel internetBill;
    
    private JTextField sendToTF_Energy;
    private JTextField AmountMoney_Energy;
    private JButton sendBTN_Energy;
    
    private JTextField sendToTF_Internet;
    private JTextField AmountMoney_Internet;
    private JButton sendBTN_Internet;
    
    private JTextField sendToTF_Water;
    private JTextField AmountMoney_Water;
    private JButton sendBTN_Water;

    public Bank_PayBillContainer(){
        initComponents();
        initComponentsListeners();
         initImplementation();
    }
    
    public Bank_PayBillContainer(UserAccount user) {
        initComponents();
        initComponentsListeners();
        this.user = user;
        initImplementation();
    }

    public void setDashboard(Bank_DashboardContainer dashboard) {
        this.dashboard = dashboard;
    }

    public void setDatabase(DatabaseImplementations database) {
        this.database = database;
    }
    
    private void HidePayDashboard(){
           this.setVisible(false);
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        backIcon1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        payBills = new bank.program.dashboard.Components.PayBills();
        payBillEnergy2 = new bank.PayBillComponents.PayBillEnergy();
        payBillWater2 = new bank.PayBillComponents.PayBillWater();
        payBillInternet2 = new bank.PayBillComponents.PayBillInternet();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(backIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        backIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(backIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        jTabbedPane1.addTab("tab5", payBills);
        jTabbedPane1.addTab("tab2", payBillEnergy2);
        jTabbedPane1.addTab("tab3", payBillWater2);
        jTabbedPane1.addTab("tab4", payBillInternet2);

        MainPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1190, 670));

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
    }
    
    private void initComponentsListeners(){
        
        backIcon.setVisible(true);
        backIcon.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            HidePayDashboard();
            dashboard.setVisible(true);
            backIcon.setVisible(true);
            dashboard.updateBalance();
        }  
        });
        
        backIcon1.setVisible(true);
        backIcon1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
                if(jTabbedPane1.getSelectedIndex() != 0){
                    jTabbedPane1.setSelectedIndex(0);
                    backIcon1.setVisible(false);
                    backIcon.setVisible(true);

                }
            }  
        });


      
        electricityBill = new JLabel();
        electricityBill = payBills.getElectricity();
        electricityBill.addMouseListener(new MouseAdapter() {                                      
            public void mouseClicked(MouseEvent e) {
                backIcon.setVisible(false);        
                backIcon1.setVisible(true);
                jTabbedPane1.setSelectedIndex(1);
            }  
        });
        waterBill = new JLabel();
        waterBill = payBills.getWater();
        waterBill.addMouseListener(new MouseAdapter() {                                      
            public void mouseClicked(MouseEvent e) {
                backIcon.setVisible(false);        
                backIcon1.setVisible(true);
                jTabbedPane1.setSelectedIndex(2);
            }  
        });
        internetBill = new JLabel();
        internetBill = payBills.getCable();
        internetBill.addMouseListener(new MouseAdapter() {                                      
            public void mouseClicked(MouseEvent e) {
                backIcon.setVisible(false);        
                backIcon1.setVisible(true);
                jTabbedPane1.setSelectedIndex(3);
            }  
        });
        
        
    }
    
    private void initImplementation(){
        
        //ENERGY PANEL ------------------------------
        sendToTF_Energy = new JTextField();
        AmountMoney_Energy = new JTextField();
        sendBTN_Energy = new JButton();
        
        sendToTF_Energy = payBillEnergy2.getPayToTF();
        AmountMoney_Energy = payBillEnergy2.getPayAmountTF();
        sendBTN_Energy = payBillEnergy2.getSendBTN();
        
        
        sendBTN_Energy.addActionListener(e -> {
                try {
                    if(user.getBalance() >= Double.valueOf(AmountMoney_Energy.getText())){
                        System.out.println("INSIDE IS TRUE");
                    database.recordTransactionBills(
                            user.getAccountnum(),
                            sendToTF_Energy.getText() ,
                            Double.parseDouble(AmountMoney_Energy.getText()),
                            "Pay Bills",
                            "Electricity Bills");
                    
                    //update the user balance in db
                    database.updateUserBalance(user.getAccountnum(), 
                            Math.abs(user.getBalance()- Double.valueOf(AmountMoney_Energy.getText())));
                    
                    JOptionPane.showMessageDialog(null, "ELECTRICITY BILL PAID SUCCESSFULLY!",
                    "SUCCESSFULL", JOptionPane.WARNING_MESSAGE);
                    //updating the current user balance in program
                    user.setBalance(Math.abs(user.getBalance()- Double.valueOf(AmountMoney_Energy.getText())));
                    dashboard.setUser(user);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient balance. Please check your balance and try again.",
                        "Insufficient Balance", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "ERROR IN DATABASE OCCURED",
                    "ERROR DATABASE", JOptionPane.WARNING_MESSAGE);
                }    
        });
        
        
        //Internet------------------------------------
        sendToTF_Internet = new JTextField();
        AmountMoney_Internet = new JTextField();
        sendBTN_Internet = new JButton();
        
        sendToTF_Internet = payBillInternet2.getPayToTF();
        AmountMoney_Internet = payBillInternet2.getPayAmountTF();
        sendBTN_Internet = payBillInternet2.getSendBTN();
        
         sendBTN_Internet.addActionListener(e -> {
                try {
                    if(user.getBalance() >= Double.valueOf(AmountMoney_Internet.getText())){
                        System.out.println("INSIDE IS TRUE");
                    database.recordTransactionBills(
                            user.getAccountnum(),
                            sendToTF_Internet.getText() ,
                            Double.parseDouble(AmountMoney_Internet.getText()),
                            "Pay Bills",
                            "Internet Bills");
                    
                    //update the user balance in db
                    database.updateUserBalance(user.getAccountnum(), 
                            Math.abs(user.getBalance()- Double.valueOf(AmountMoney_Internet.getText())));
                    
                    JOptionPane.showMessageDialog(null, "INTERNET BILL PAID SUCCESSFULLY!",
                    "SUCCESSFULL", JOptionPane.WARNING_MESSAGE);
                    //updating the current user balance in program
                    user.setBalance(Math.abs(user.getBalance()- Double.valueOf(AmountMoney_Internet.getText())));
                    dashboard.setUser(user);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient balance. Please check your balance and try again.",
                        "Insufficient Balance", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "ERROR IN DATABASE OCCURED",
                    "ERROR DATABASE", JOptionPane.WARNING_MESSAGE);
                }    
        });
        
        //Water Bill-----------------------------------
        sendToTF_Water = new JTextField();
        AmountMoney_Water = new JTextField();
        sendBTN_Water = new JButton();
        
        sendToTF_Water = payBillWater2.getPayToTF();
        AmountMoney_Water = payBillWater2.getPayAmountTF();
        sendBTN_Water = payBillWater2.getSendBTN();
        
         sendBTN_Water.addActionListener(e -> {
              try {
                    if(user.getBalance() >= Double.valueOf(AmountMoney_Water.getText())){
                        System.out.println("INSIDE IS TRUE");
                    database.recordTransactionBills(
                            user.getAccountnum(),
                            sendToTF_Water.getText() ,
                            Double.parseDouble(AmountMoney_Water.getText()),
                            "Pay Bills",
                            "Water Bills");
                    
                    //update the user balance in db
                    database.updateUserBalance(user.getAccountnum(), 
                            Math.abs(user.getBalance()- Double.valueOf(AmountMoney_Water.getText())));
                    
                    JOptionPane.showMessageDialog(null, "WATER BILL PAID SUCCESSFULLY!",
                    "SUCCESSFULL", JOptionPane.WARNING_MESSAGE);
                    //updating the current user balance in program
                    user.setBalance(Math.abs(user.getBalance()- Double.valueOf(AmountMoney_Water.getText())));
                    dashboard.setUser(user);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient balance. Please check your balance and try again.",
                        "Insufficient Balance", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "ERROR IN DATABASE OCCURED",
                    "ERROR DATABASE", JOptionPane.WARNING_MESSAGE);
                }  
        });
        
    }
    
    public static void main(String[] args) {
        new Bank_PayBillContainer().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel backIcon1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private bank.PayBillComponents.PayBillEnergy payBillEnergy2;
    private bank.PayBillComponents.PayBillInternet payBillInternet2;
    private bank.PayBillComponents.PayBillWater payBillWater2;
    private bank.program.dashboard.Components.PayBills payBills;
    // End of variables declaration//GEN-END:variables
}
