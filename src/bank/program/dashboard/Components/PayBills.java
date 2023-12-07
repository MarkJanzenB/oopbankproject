
package bank.program.dashboard.Components;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PayBills extends javax.swing.JPanel {


    public PayBills() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        water = new javax.swing.JLabel();
        electricity1 = new javax.swing.JLabel();
        cable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel5.setText("Pay Bills");

        water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/water-tap (1).png"))); // NOI18N
        water.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        water.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waterMouseClicked(evt);
            }
        });

        electricity1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home (1).png"))); // NOI18N
        electricity1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electricity1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electricity1MouseClicked(evt);
            }
        });

        cable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wifi-router (1).png"))); // NOI18N
        cable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cableMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel1.setText("Electric Utilities");

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel2.setText("Water Utilities");

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel3.setText("Cable/Internet");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Biller: Aeron Clyde");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(487, 487, 487))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(electricity1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(water, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(cable, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(222, 222, 222))))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(water, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(electricity1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void waterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waterMouseClicked
        // TODO add your handling code here:
        createPaymentWindow("Water");
    }//GEN-LAST:event_waterMouseClicked

    private void electricity1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electricity1MouseClicked
        // TODO add your handling code here:
        createPaymentWindow("Cable");
    }//GEN-LAST:event_electricity1MouseClicked

    private void cableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cableMouseClicked
        // TODO add your handling code here:
        createPaymentWindow("Cable");
    }//GEN-LAST:event_cableMouseClicked

      private void createPaymentWindow(String utilityName) {
        JFrame paymentFrame = new JFrame(utilityName + " Payment");
        JPanel panel = new JPanel();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel accountLabel = new JLabel("Account Number:");
        JTextField accountField = new JTextField(15);
        JLabel amountLabel = new JLabel("Payment Amount:");
        JTextField amountField = new JTextField(15);

        JButton sendPaymentButton = new JButton("Send Payment");
        
        sendPaymentButton.addActionListener(e -> {
            String accountNumber = accountField.getText();
            String paymentAmount = amountField.getText();
            
            System.out.println("Utility: " + utilityName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Payment Amount: " + paymentAmount);
            
            JOptionPane.showMessageDialog(paymentFrame,
                "Payment Successful for " + utilityName + "!",
                "Payment Status",
                JOptionPane.INFORMATION_MESSAGE);
        });

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(accountLabel, constraints);

        constraints.gridx = 1;
        panel.add(accountField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(amountLabel, constraints);

        constraints.gridx = 1;
        panel.add(amountField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(sendPaymentButton, constraints);

        paymentFrame.add(panel);
        paymentFrame.setSize(300, 200);
        paymentFrame.setLocationRelativeTo(null);
        paymentFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cable;
    private javax.swing.JLabel electricity1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel water;
    // End of variables declaration//GEN-END:variables
}
