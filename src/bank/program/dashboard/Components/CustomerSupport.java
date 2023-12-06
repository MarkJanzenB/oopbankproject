
package bank.program.dashboard.Components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class CustomerSupport extends javax.swing.JPanel {

    public CustomerSupport() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        helpBTN = new javax.swing.JButton();
        faqsAndTroubleBTN = new javax.swing.JButton();
        guideBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 55)); // NOI18N
        jLabel1.setText("Welcome to Help and Support!");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(3, 3, 3), 3, true));
        jLabel1.setMaximumSize(new java.awt.Dimension(142, 59));
        jLabel1.setMinimumSize(new java.awt.Dimension(142, 59));
        jLabel1.setPreferredSize(new java.awt.Dimension(142, 59));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help-desk (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/faq (1) (1).png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user-guide (1).png"))); // NOI18N

        helpBTN.setBackground(new java.awt.Color(255, 204, 204));
        helpBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        helpBTN.setText("Help");
        helpBTN.setBorder(null);
        helpBTN.setMaximumSize(new java.awt.Dimension(91, 34));
        helpBTN.setMinimumSize(new java.awt.Dimension(91, 34));
        helpBTN.setPreferredSize(new java.awt.Dimension(91, 34));
        helpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBTNActionPerformed(evt);
            }
        });

        faqsAndTroubleBTN.setBackground(new java.awt.Color(204, 255, 204));
        faqsAndTroubleBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        faqsAndTroubleBTN.setText("FAQs and Troubleshooting");
        faqsAndTroubleBTN.setMaximumSize(new java.awt.Dimension(91, 34));
        faqsAndTroubleBTN.setMinimumSize(new java.awt.Dimension(91, 34));
        faqsAndTroubleBTN.setPreferredSize(new java.awt.Dimension(91, 34));
        faqsAndTroubleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqsAndTroubleBTNActionPerformed(evt);
            }
        });

        guideBTN.setBackground(new java.awt.Color(204, 204, 255));
        guideBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        guideBTN.setText("Guides");
        guideBTN.setMaximumSize(new java.awt.Dimension(91, 34));
        guideBTN.setMinimumSize(new java.awt.Dimension(91, 34));
        guideBTN.setPreferredSize(new java.awt.Dimension(91, 34));
        guideBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideBTNActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/notification (1).png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/new-email.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(helpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(faqsAndTroubleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guideBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faqsAndTroubleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guideBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void helpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBTNActionPerformed
         // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Contact Information:\n\n"
                + "Bank Address: N. Bacalso Avenue Cebu City, Philippines\n\n"
                + "Telephone Numbers: +63 32 411 2000 (trunkline)\n\n"
                + "Fax Number: +63 32 2617743\n\n"
                + "Website: http://www.teambangan.com.ph\n\n"
                + "Bank Email: teambangancontact@bank.com");
    }//GEN-LAST:event_helpBTNActionPerformed

    private void faqsAndTroubleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqsAndTroubleBTNActionPerformed
         // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Frequently Asked Questions:\n\n"
                + "Q: How do I reset my password?\n"
                + "A: You can reset your password by...\n\n"
                + "Q: What should I do if my transaction fails?\n"
                + "A: If your transaction fails, please check...\n\n"
                + "Q: How to change/update the mailing address?\n"
                + "A: Kindly place a request at the nearest branch for changing the Mailing address...\n\n"
                + "Q: How many fund transfer/bills payment transactions can i do per day?\n"
                + "A: There is no daily limit for fund transfer and bills payment transaction....");
    }//GEN-LAST:event_faqsAndTroubleBTNActionPerformed

    private void guideBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideBTNActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Step-by-Step Guides:\n\n"
                + "1. How to Transfer Funds\n"
                + "Transferring Funds: To transfer funds, follow these steps...\n\n"
                + "2. Setting Up Recurring Payments\n"
                + "Setting Up Payments: To set up payments, follow these steps...\n\n"
                + "3. Applying for a Loan"
                + "Applying for a Loan: To apply for a loan, follow these steps...\n\n");
    }//GEN-LAST:event_guideBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton faqsAndTroubleBTN;
    private javax.swing.JButton guideBTN;
    private javax.swing.JButton helpBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
