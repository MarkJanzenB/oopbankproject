
package bank.program;

import bank.classes.UserAccount;
import bank.program.dashboard.Components.Dashboard;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Bank_PayBillContainer extends javax.swing.JFrame {
    private UserAccount user;
    private Bank_DashboardContainer dashboard;
    private JLabel electricityBill;
    private JLabel waterBill;
    private JLabel internetBill;
    
  

    public Bank_PayBillContainer(){
        initComponents();
        initComponentsListeners();
    }
    
    public Bank_PayBillContainer(UserAccount user) {
        initComponents();
        initComponentsListeners();
        payBills.setUser(user);

    }

    public void setDashboard(Bank_DashboardContainer dashboard) {
        this.dashboard = dashboard;
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
        payBillEnergy1 = new bank.PayBillComponents.PayBillEnergy();
        payBillWater1 = new bank.PayBillComponents.PayBillWater();
        payBillInternet1 = new bank.PayBillComponents.PayBillInternet();

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
        jTabbedPane1.addTab("tab2", payBillEnergy1);
        jTabbedPane1.addTab("tab3", payBillWater1);
        jTabbedPane1.addTab("tab4", payBillInternet1);

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
        
        backIcon.setVisible(true);
        backIcon.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
        HidePayDashboard();
        dashboard.setVisible(true);
        backIcon.setVisible(true);

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
    
    public static void main(String[] args) {
        new Bank_PayBillContainer().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel backIcon1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private bank.PayBillComponents.PayBillEnergy payBillEnergy1;
    private bank.PayBillComponents.PayBillInternet payBillInternet1;
    private bank.PayBillComponents.PayBillWater payBillWater1;
    private bank.program.dashboard.Components.PayBills payBills;
    // End of variables declaration//GEN-END:variables
}
