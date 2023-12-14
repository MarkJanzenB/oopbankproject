
package CustomTableCell;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableActionCellEditorEDIT extends DefaultCellEditor{
    private TableActionEventEDIT event;

    public TableActionCellEditorEDIT(TableActionEventEDIT event) {
        super(new JCheckBox());
        this.event = event;
    }
   
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelActionEDIT action = new PanelActionEDIT();  
        action.initEvent(event, row);
        action.setBackground(table.getSelectionBackground());
        return action;
    }
    
}
