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


public class atmAccess extends javax.swing.JFrame {
    private UserAccount user;
    private DatabaseImplementations database;
    private JButton StartBTN; 
    private JButton DoneBTN; 
    private atmDashboard atm;
    public atmAccess(){
        initComponents();
        initComponentsListeners();
    }
    
public atmAccess(UserAccount user) {
    initComponents();
    initComponentsListeners();
    atmInputPIN1.setUser(user);
    atmInputUID1.setUser(user);
    database = new DatabaseImplementations();
    
    this.user = user; // Add this line to assign the user object
}

    public void setDatabase(DatabaseImplementations database) {
        this.database = database;
    }
   
    private void hideATMacess(){
           this.setVisible(false);
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        atmInputUID1 = new atm.Components.atmInputUID();
        atmInputPIN1 = new atm.Components.atmInputPIN();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 255, 255));
        MainPanel.setMinimumSize(new java.awt.Dimension(1033, 625));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addTab("tab1", atmInputUID1);
        jTabbedPane1.addTab("tab2", atmInputPIN1);

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
                    
      StartBTN = new JButton();
      StartBTN = atmInputUID1.getStartBTN();
      StartBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               jTabbedPane1.setSelectedIndex(1);

            }
      });


                          
      DoneBTN = new JButton();
      DoneBTN = atmInputPIN1.getDoneBTN();
      DoneBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             atm=new atmDashboard();
             atm.setVisible(true);
             hideATMacess();

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
        new atmAccess().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private atm.Components.atmInputPIN atmInputPIN1;
    private atm.Components.atmInputUID atmInputUID1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

