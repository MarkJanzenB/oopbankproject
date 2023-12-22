
package bank.program.SignUpComponents;

import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Personal_Information extends javax.swing.JPanel {
    
    private UserAccount user;
    public Personal_Information() {
        initComponents();        
    }
    
    public void setUser(UserAccount user) {
        this.user = user;
    }

    public JButton getBtn_Next() {
        return btn_Next;
    }

    public JTextField getAddressTF() {
        return addressTF;
    }

    public JTextField getEmailAddressTF() {
        return emailAddressTF;
    }

    public JTextField getMobileNumberTF() {
        return mobileNumberTF;
    }


    public JPasswordField getPassTF() {
        return passTF;
    }

    public JTextField getFirstnameTF() {
        return firstnameTF;
    }

    public void setFirstnameTF(JTextField firstnameTF) {
        this.firstnameTF = firstnameTF;
    }

    public JTextField getLastnameTF() {
        return lastnameTF;
    }

    public void setLastnameTF(JTextField lastnameTF) {
        this.lastnameTF = lastnameTF;
    }

   
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstnameTF = new javax.swing.JTextField();
        mobileNumberTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        emailAddressTF = new javax.swing.JTextField();
        btn_Next = new javax.swing.JButton();
        passTF = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lastnameTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));
        setMaximumSize(new java.awt.Dimension(743, 502));
        setMinimumSize(new java.awt.Dimension(743, 502));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setText("PERSONAL DETAILS");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setText("First name:");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel5.setText("Mobile Number:");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel7.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel6.setText("Email Address:");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel8.setText("Password:");

        btn_Next.setText("Next");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel3.setText("Last name:");

        lastnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel9.setText("+63");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstnameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(addressTF, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(emailAddressTF, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(passTF)
                    .addComponent(lastnameTF)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobileNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(mobileNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton btn_Next;
    private javax.swing.JTextField emailAddressTF;
    private javax.swing.JTextField firstnameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnameTF;
    private javax.swing.JTextField mobileNumberTF;
    private javax.swing.JPasswordField passTF;
    // End of variables declaration//GEN-END:variables
}
