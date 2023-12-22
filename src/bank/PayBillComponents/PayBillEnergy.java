
package bank.PayBillComponents;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author markj
 */
public class PayBillEnergy extends javax.swing.JPanel {

    /**
     * Creates new form PayEnergy
     */
    public PayBillEnergy() {
        initComponents();
    }

    public JTextField getPayAmountTF() {
        return payAmountTF;
    }

    public JTextField getPayToTF() {
        return payToTF;
    }

    public JButton getSendBTN() {
        return sendBTN;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        electricity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        payToTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        payAmountTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sendBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setName(""); // NOI18N

        electricity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home (1).png"))); // NOI18N
        electricity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electricity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electricityMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 48)); // NOI18N
        jLabel1.setText("Pay Energy Bill");

        payToTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Pay to:");

        payAmountTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Amount to pay: ");

        sendBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sendBTN.setText("Send Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(electricity, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payToTF)
                            .addComponent(payAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(401, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sendBTN)
                .addGap(559, 559, 559))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(electricity, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(payToTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(payAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(sendBTN)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void electricityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electricityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_electricityMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel electricity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField payAmountTF;
    private javax.swing.JTextField payToTF;
    private javax.swing.JButton sendBTN;
    // End of variables declaration//GEN-END:variables
}
