
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.CarVersion;
import view.ListCarVersionView;


public class ListCarVersionControl implements ActionListener {
    
    private view.ListCarVersionView listCarVersionView;
    
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
            //desenvolver a codigifação da exclusao dos dados
        }
        
    }
}
