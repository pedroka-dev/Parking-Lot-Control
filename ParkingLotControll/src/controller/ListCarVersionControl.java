
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAOSer.CarVersionDAOSer;
import model.bo.CarVersion;
import view.ListCarVersionView;


public class ListCarVersionControl implements ActionListener {
    
    private view.ListCarVersionView listCarVersionView;
    CarVersionDAOSer carVersionDAOSer = new CarVersionDAOSer();
    
    public ListCarVersionControl(ListCarVersionView listCarVersionView) {
        
        this.listCarVersionView = listCarVersionView;

        this.listCarVersionView.getjButtonEdit().addActionListener(this);
        this.listCarVersionView.getjButtonExit().addActionListener(this);
        this.listCarVersionView.getjButtonDelete().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.listCarVersionView.getjTableCarVersion().getModel();
        for (CarVersion carVersionInstance : service.CarVersionService.Retrieve()) {
            tabela.addRow(new Object[]{carVersionInstance.getId(), carVersionInstance.getNameVersion(), 
                carVersionInstance.getTypeFuel(),carVersionInstance.getNumberSeats()});
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listCarVersionView.getjButtonEdit()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.listCarVersionView.getjButtonExit()) {
            this.listCarVersionView.dispose();
        }
        else if (e.getSource() == this.listCarVersionView.getjButtonDelete()) {
            int id = this.listCarVersionView.getjTableCarVersion().getSelectedRow();
            if(id != -1) {
                carVersionDAOSer.Delete(id);
                this.listCarVersionView.dispose();
            }
        }
    }
}
