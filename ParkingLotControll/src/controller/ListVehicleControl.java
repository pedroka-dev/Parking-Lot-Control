
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ListVehicleView;


public class ListVehicleControl implements ActionListener {
    
    private view.ListVehicleView listVehicleView;
    
    public ListVehicleControl(ListVehicleView listVehicleView) {
        
        this.listVehicleView = listVehicleView;

        this.listVehicleView.getjButtonEdit().addActionListener(this);
        this.listVehicleView.getjButtonExit().addActionListener(this);
        this.listVehicleView.getjButtonDelete().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listVehicleView.getjButtonEdit()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.listVehicleView.getjButtonExit()) {
            this.listVehicleView.dispose();
        }
        else if (e.getSource() == this.listVehicleView.getjButtonDelete()) {
            //desenvolver a codigifação da exclusao dos dados
        }
        
    }
}
