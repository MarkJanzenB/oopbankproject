
package bank.program;

import bank.classes.UserAccount;
import bank.program.dashboard.Components.Dashboard;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Bank_DashboardContainer extends javax.swing.JFrame {
    private UserAccount user;
    private JPanel balancePanel;
    private JPanel sendMoneyBalancePanel;
    private JLabel utilityBillsIcon;
    private JLabel authIcon;
    private JLabel transferMoneyIcon;
    private JLabel customerSupportIcon;
    private Bank_PayBillContainer pay_dashboard;

    public Bank_DashboardContainer(){
        initComponents();
        initComponentsListeners();
    }
    
    public Bank_DashboardContainer(UserAccount user) {
        initComponents();
        initComponentsListeners();
        dashboard1.setUser(user);
        accountDetails1.setUser(user);
        sendMoney1.setUser(user);
        pay_dashboard = new Bank_PayBillContainer(user);
        pay_dashboard.setDashboard(this);

        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(backIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        jTabbedPane1.addTab("tab5", dashboard1);
        jTabbedPane1.addTab("tab2", accountDetails1);
        jTabbedPane1.addTab("tab3", sendMoney1);
        jTabbedPane1.addTab("tab4", customerSupport1);

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
                if(jTabbedPane1.getSelectedIndex() != 0){
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
      
//      sendMoneyBalancePanel = new JPanel();
//      sendMoneyBalancePanel = sendMoney1.getBalancePanel();
//      sendMoneyBalancePanel.addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//            }
//      });

      
      utilityBillsIcon = new JLabel();
      utilityBillsIcon = dashboard1.getUtilityBillsIcon();
      utilityBillsIcon.addMouseListener(new MouseAdapter() {
          
        public void mouseClicked(MouseEvent e) {
                    pay_dashboard.setVisible(true);     
                    hideDashboard();
            }  
        });
      
      authIcon = new JLabel();
      authIcon = dashboard1.getAuthIcon();
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
    // End of variables declaration//GEN-END:variables
}
