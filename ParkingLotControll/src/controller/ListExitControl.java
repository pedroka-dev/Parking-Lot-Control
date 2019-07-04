
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Exit;
import view.ListExitView;


public class ListExitControl implements ActionListener {
    
    private view.ListExitView listExitView;
    
    public ListExitControl(ListExitView listExitView) {
        
        this.listExitView = listExitView;

        this.listExitView.getjButtonExit().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.listExitView.getjTableExit().getModel();
        for (Exit exitInstance : service.ExitService.Retrieve()) {
            tabela.addRow(new Object[]{exitInstance.getId(), exitInstance.getNumberPlate()});
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listExitView.getjButtonExit()) {
            this.listExitView.dispose();
        }
    }
}
