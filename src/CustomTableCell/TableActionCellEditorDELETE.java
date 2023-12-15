
package CustomTableCell;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class TableActionCellEditorDELETE extends DefaultCellEditor{
    
    private TableActionEventDELETE event;

    public TableActionCellEditorDELETE(TableActionEventDELETE event) {
        super(new JCheckBox());
        this.event = event;
    }
   
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelActionDELETE action = new PanelActionDELETE();  
        action.initEvent(event, row, column);
        action.setBackground(table.getSelectionBackground());
        return action;
    }
    
    
}
