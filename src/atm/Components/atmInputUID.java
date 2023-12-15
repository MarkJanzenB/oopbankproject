
package atm.Components;

import bank.program.SignUpComponents.*;
import bank.classes.UserAccount;
import javax.swing.JButton;
import javax.swing.JPasswordField;



public class atmInputUID extends javax.swing.JPanel {
    
    private UserAccount user;

    public atmInputUID() {
        initComponents();
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public JPasswordField getPinTF() {
        return uidTF;
    }

    public void setUidTF(JPasswordField uidTF) {
        this.uidTF = uidTF;
    }

    public JPasswordField getUidTF() {
        return uidTF;
    }

   
    
    public JButton getStartBTN() {
        return startBTN;
    }
    
    //one method that calls dao
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uidTF = new javax.swing.JPasswordField();
        startBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 255));
        setMaximumSize(new java.awt.Dimension(1033, 625));
        setMinimumSize(new java.awt.Dimension(1033, 625));
        setPreferredSize(new java.awt.Dimension(1033, 625));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("Bank of the Bangko Center");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("Enter Card Details");

        startBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        startBTN.setText("Start Transaction");

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
                        .addGap(424, 424, 424)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uidTF, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(startBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(startBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton startBTN;
    private javax.swing.JPasswordField uidTF;
    // End of variables declaration//GEN-END:variables

}
