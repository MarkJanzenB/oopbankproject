
package Manager.Components;

import CustomTableCell.TableActionCellEditorEDIT;
import CustomTableCell.TableActionCellRenderEDIT;
import CustomTableCell.TableActionEventEDIT;
import PersistenceLayer.DatabaseImplementations;
import bank.classes.UserAccount;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UpdateUser extends javax.swing.JPanel {

    private DatabaseImplementations database;
    private ArrayList<UserAccount> results;
    private UserAccount user;
    private String[] data;
  
    public UpdateUser() {
  
        database = new DatabaseImplementations();
        results = new ArrayList<>();
        results = database.getAllUsers();
        data = new String[4];
      
        
        initComponents();
         TableActionEventEDIT event = new TableActionEventEDIT() {
            @Override
            public void onEdit() {
                JOptionPane.showMessageDialog(null, "DELETE PANEL WILL BE OPEN");
            }
        };
        
        jTable1.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRenderEDIT());
        jTable1.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditorEDIT(event));
        
        try {
             if(results.size() != 0)   
                for (int i = 0; i < results.size(); i++) {
                    data[0] = results.get(i).getFirstname();
                    data[1] = results.get(i).getLastname();
                    data[2] = String.valueOf(results.get(i).getAccountnum());
                    data[3] = "";
                    addRowToTable(data);
                }
            else {
                System.out.println("ResultSet is null. Error retrieving data.");
            }
        } catch (Exception ex) {
            System.out.println("Error in displaying data in Update User Table: " + ex.getMessage());
         }

    }   
    public void setUsers(UserAccount users) {
        this.user = user;
    }

    public void setResults(ArrayList<UserAccount> results) {
        this.results = results;
    }
    
    private void addRowToTable(Object[] data){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(data);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setText("UPDATE USER");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIRST NAME", "LAST NAME", "ACCOUNT NUMBER", "ACTION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(60, 160));
        jTable1.setRowHeight(48);
        jTable1.setSelectionBackground(new java.awt.Color(57, 137, 111));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
