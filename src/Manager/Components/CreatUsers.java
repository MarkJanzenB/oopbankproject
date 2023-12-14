
package Manager.Components;


public class CreatUsers extends javax.swing.JPanel {

    /**
     * Creates new form CreatUsers
     */
    public CreatUsers() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passTF = new javax.swing.JTextField();
        firstNameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        phoneNumberTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        createBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("CREATE USER");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setText(" FIRST NAME:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setText("Last NAME:");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setText("Phone Number:");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setText("Password:");

        createBTN.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        createBTN.setText("CREATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passTF)
                            .addComponent(addressTF)
                            .addComponent(lastNameTF)
                            .addComponent(firstNameTF)
                            .addComponent(phoneNumberTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(emailTF))))
                .addContainerGap(370, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(749, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(phoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(createBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(309, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(254, 254, 254)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton createBTN;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField passTF;
    private javax.swing.JTextField phoneNumberTF;
    // End of variables declaration//GEN-END:variables
}
