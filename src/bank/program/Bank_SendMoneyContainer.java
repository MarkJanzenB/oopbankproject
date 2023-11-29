
package bank.program;

import bank.classes.UserAccount;
import bank.program.dashboard.Components.Dashboard;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Bank_SendMoneyContainer extends javax.swing.JFrame {
    private UserAccount user;
    private JPanel balancePanel;
    private JLabel utilityBillsIcon;
    private JLabel authIcon;
    private JLabel transferMoneyIcon;
    private JLabel customerSupportIcon;
    
    public Bank_SendMoneyContainer(UserAccount user) {
        initComponents();
        initComponentsListeners();
        dashboard1.setUser(user);
        accountDetails1.setUser(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashboard1 = new bank.program.dashboard.Components.Dashboard();
        accountDetails1 = new bank.program.dashboard.Components.AccountDetails();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(backIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        jTabbedPane1.addTab("tab1", dashboard1);
        jTabbedPane1.addTab("tab2", accountDetails1);

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

    private void initComponentsListeners(){
        
        backIcon.setVisible(false);
        backIcon.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
                if(jTabbedPane1.getSelectedIndex() == 1){
                    backIcon.setVisible(false);
                    jTabbedPane1.setSelectedIndex(0);
                }
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
                JOptionPane.showMessageDialog(null, "Utilities Bill JFrame will be Opened");
            }  
        });
      authIcon = new JLabel();
//      authIcon = dashboard1.getAuthIcon();
      authIcon.addMouseListener(new MouseAdapter() {
          @Override
        public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(null, "authentication JFrame will be Opened");
            }  
        });
      transferMoneyIcon = new JLabel();
      transferMoneyIcon = dashboard1.getTransferMoneyIcon();
      transferMoneyIcon.addMouseListener(new MouseAdapter() {
          @Override
        public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "transfer Money JFrame will be Opened");
            }  
        });
      customerSupportIcon = new JLabel();
      customerSupportIcon = dashboard1.getCustomerSupportIcon();
      customerSupportIcon.addMouseListener(new MouseAdapter() {
          @Override      
        public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "customerSupport JFrame will be Opened");
            }  
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private bank.program.dashboard.Components.AccountDetails accountDetails1;
    private javax.swing.JLabel backIcon;
    private bank.program.dashboard.Components.Dashboard dashboard1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
