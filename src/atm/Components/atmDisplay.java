
package atm.Components;

import bank.program.SignUpComponents.*;
import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import javax.swing.JButton;
import javax.swing.JPasswordField;



public class atmDisplay extends javax.swing.JPanel {
    
    private UserAccount user;

    public atmDisplay() {
        initComponents();
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public JButton getCancelBTN() {
        return cancelBTN;
    }

    public JButton getChkbalBTN() {
        return chkbalBTN;
    }

    public JButton getWithdrawBTN() {
        return withdrawBTN;
    }

    
    //one method that calls dao
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        chkbalBTN = new javax.swing.JButton();
        withdrawBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 255));
        setMaximumSize(new java.awt.Dimension(1033, 625));
        setMinimumSize(new java.awt.Dimension(1033, 625));
        setPreferredSize(new java.awt.Dimension(1033, 625));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("Bank of the Bangko Center");

        chkbalBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        chkbalBTN.setText("BALANCE INQUIRY");

        withdrawBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        withdrawBTN.setText("WITHDRAW");

        cancelBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        cancelBTN.setText("CANCEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(withdrawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(chkbalBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbalBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBTN;
    private javax.swing.JButton chkbalBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton withdrawBTN;
    // End of variables declaration//GEN-END:variables

}
