package Admin.program.Container;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminDashboard extends javax.swing.JFrame {

    public AdminDashboard() {
        initComponents();
        initIcons();
    }

    private void initIcons() {

        createIcon.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTabbedPane1.setSelectedIndex(0);
            }
        });

        updateIcon.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTabbedPane1.setSelectedIndex(1);
            }
        });

        deleteIcon.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTabbedPane1.setSelectedIndex(2);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iconHolder = new javax.swing.JPanel();
        createIcon = new javax.swing.JLabel();
        updateIcon = new javax.swing.JLabel();
        deleteIcon = new javax.swing.JLabel();
        TabbedpaneHolder = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        creatUsers1 = new Admin.Components.CreatUsers();
        updateUser1 = new Admin.Components.UpdateUser();
        deleteUser1 = new Admin.Components.DeleteUser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconHolder.setBackground(new java.awt.Color(255, 204, 255));

        createIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/create.png"))); // NOI18N
        createIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        updateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        updateIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deleteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        deleteIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout iconHolderLayout = new javax.swing.GroupLayout(iconHolder);
        iconHolder.setLayout(iconHolderLayout);
        iconHolderLayout.setHorizontalGroup(
            iconHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconHolderLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(iconHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteIcon)
                    .addComponent(updateIcon)
                    .addComponent(createIcon))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        iconHolderLayout.setVerticalGroup(
            iconHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconHolderLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(createIcon)
                .addGap(18, 18, 18)
                .addComponent(updateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteIcon)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jPanel1.add(iconHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        TabbedpaneHolder.setBackground(new java.awt.Color(51, 255, 255));
        TabbedpaneHolder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addTab("tab1", creatUsers1);
        jTabbedPane1.addTab("tab2", updateUser1);
        jTabbedPane1.addTab("tab3", deleteUser1);

        TabbedpaneHolder.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1040, 630));

        jPanel1.add(TabbedpaneHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1040, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabbedpaneHolder;
    private Admin.Components.CreatUsers creatUsers1;
    private javax.swing.JLabel createIcon;
    private javax.swing.JLabel deleteIcon;
    private Admin.Components.DeleteUser deleteUser1;
    private javax.swing.JPanel iconHolder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel updateIcon;
    private Admin.Components.UpdateUser updateUser1;
    // End of variables declaration//GEN-END:variables
}
