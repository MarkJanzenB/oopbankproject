package atm.program.Container;

import bank.program.*;
import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class atmDashboard extends javax.swing.JFrame {
    private UserAccount user;
    private DatabaseImplementations database;
    private JButton withdrawBTN; 
    private JButton chkbalBTN; 
    private JButton cancelBTN; 

    public atmDashboard(){
        initComponents();
        initComponentsListeners();
    }
    
public atmDashboard(UserAccount user) {
    initComponents();
    initComponentsListeners();
    atmDisplay1.setUser(user);
    database = new DatabaseImplementations();
    this.user = user; // Add this line to assign the user object
}
    
    
    private void hideDashboard(){
           this.setVisible(false);
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        atmDisplay1 = new atm.Components.atmDisplay();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 255, 255));
        MainPanel.setMinimumSize(new java.awt.Dimension(1033, 625));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addTab("tab1", atmDisplay1);

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
    private void initComponentsListeners(){
                    
      chkbalBTN = new JButton();
      chkbalBTN = atmDisplay1.getChkbalBTN();
      chkbalBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               jTabbedPane1.setSelectedIndex(1);

            }
      });


                          
      withdrawBTN = new JButton();
      withdrawBTN = atmDisplay1.getWithdrawBTN();
      withdrawBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

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
        new atmDashboard().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private atm.Components.atmDisplay atmDisplay1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

