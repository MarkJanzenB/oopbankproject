
package Manager.Components;

import CustomTableCell.TableActionCellEditorDELETE;
import CustomTableCell.TableActionCellRenderDELETE;
import CustomTableCell.TableActionCellRenderEDIT;
import javax.swing.JOptionPane;
import CustomTableCell.TableActionEventDELETE;
import javax.swing.table.DefaultTableModel;


public class DeleteUser extends javax.swing.JPanel {

      private String[] users;
    public DeleteUser() {
        initComponents();
        String[] resultSet = {"Ac", "Espina", "1000"};
        TableActionEventDELETE event = new TableActionEventDELETE() {
            @Override
            public void onDelete(int row) {
                //JOptionPane.showMessageDialog(null, "DELETE PANEL WILL BE OPEN");
                if(jTable1.isEditing()){
                    jTable1.getCellEditor().stopCellEditing();
                }
                DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
                model.removeRow(row);
            }
        };
        jTable1.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRenderDELETE());
        jTable1.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditorDELETE(event));
        
        for (int i = 0; i < 5; i++) {
            addRowToTable(resultSet);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("DELETE USER");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIRST NAME", "LAST NAME", "ACCOUNT NUMBER", "DELETE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(60, 160));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(57, 137, 111));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addRowToTable(Object[] data){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(data);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
