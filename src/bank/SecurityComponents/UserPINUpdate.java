
package bank.SecurityComponents;

import bank.program.SignUpComponents.*;
import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import javax.swing.JButton;
import bank.SecurityComponents.UserPINUpdate;
import javax.swing.JPasswordField;



public class UserPINUpdate extends javax.swing.JPanel {
    
    private UserAccount user;
    private DatabaseImplementations database;

    public UserPINUpdate() {
        initComponents();
    }

    public void setUser(UserAccount user) {
        this.user = user;  
    }

    public void setDatabase(DatabaseImplementations database) {
        this.database = database;
    }

    public JPasswordField getNewpinTF() {
        return newpinTF;
    }

    public JPasswordField getPinTF() {
        return pinTF;
    }



    public JButton getDoneBTN() {
        return DoneBTN;
    }


    
    //one method that calls dao
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pinTF = new javax.swing.JPasswordField();
        DoneBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        newpinTF = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 153, 255));
        setPreferredSize(new java.awt.Dimension(1165, 589));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("Security Details");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("Enter Your Current Pin");

        DoneBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        DoneBTN.setText("DONE");
        DoneBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneBTNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setText("Enter new Pin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newpinTF)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pinTF)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(486, 486, 486))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(DoneBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(DoneBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DoneBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneBTNActionPerformed
    }//GEN-LAST:event_DoneBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField newpinTF;
    private javax.swing.JPasswordField pinTF;
    // End of variables declaration//GEN-END:variables

}
