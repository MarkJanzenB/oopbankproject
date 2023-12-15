
package atm.Components;

import bank.program.SignUpComponents.*;
import bank.classes.UserAccount;
import javax.swing.JButton;
import javax.swing.JPasswordField;



public class atmInputPIN extends javax.swing.JPanel {
    
    private UserAccount user;

    public atmInputPIN() {
        initComponents();
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public JPasswordField getPinTF() {
        return pinTF;
    }

    public void setPinTF(JPasswordField pinTF) {
        this.pinTF = pinTF;
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

        setBackground(new java.awt.Color(0, 153, 255));
        setMaximumSize(new java.awt.Dimension(1033, 625));
        setMinimumSize(new java.awt.Dimension(1033, 625));
        setPreferredSize(new java.awt.Dimension(1033, 625));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("Bank of the Bangko Center");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("Enter Your Pin");

        DoneBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        DoneBTN.setText("DONE");

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
                        .addGap(401, 401, 401)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pinTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(45, 45, 45))
                            .addComponent(DoneBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(pinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(DoneBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pinTF;
    // End of variables declaration//GEN-END:variables

}
