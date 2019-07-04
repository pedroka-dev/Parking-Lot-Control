
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Entry;
import view.ListEntryView;


public class ListEntryControl implements ActionListener {
    
    private view.ListEntryView listEntryView;
    
    public ListEntryControl(ListEntryView listEntryView) {
        
        this.listEntryView = listEntryView;

        this.listEntryView.getjButtonExit().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.listEntryView.getjTableEntry().getModel();
        for (Entry entryInstance : service.EntryService.Retrieve()) {
            tabela.addRow(new Object[]{entryInstance.getId(), entryInstance.getNumberPlate()});
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listEntryView.getjButtonExit()) {
            this.listEntryView.dispose();
        }
    }
}
