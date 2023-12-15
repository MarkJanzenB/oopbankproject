package CustomTableCell;

import CustomTableCell.TableActionEventDELETE;
/**
 *
 * @author Admin
 */
public class PanelActionDELETE extends javax.swing.JPanel {

    public PanelActionDELETE() {
        initComponents();
    }
   
    public void initEvent(TableActionEventDELETE  event, int row, int column){
        deleteBTN.addActionListener( e -> {
            event.onDelete(row, column);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteBTN = new CustomTableCell.ActionButton();

        deleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deleteAction.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomTableCell.ActionButton deleteBTN;
    // End of variables declaration//GEN-END:variables
}
