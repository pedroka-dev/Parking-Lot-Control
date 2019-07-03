
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RegVehicleView;


public class RegVehicleControl implements ActionListener {
    
    private view.RegVehicleView regVehicleView;
    
    public RegVehicleControl(RegVehicleView regVehicleView) {
        
        this.regVehicleView = regVehicleView;

        this.regVehicleView.getjButtonSave().addActionListener(this);
        this.regVehicleView.getjButtonExit().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.regVehicleView.getjButtonSave()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.regVehicleView.getjButtonExit()) {
            this.regVehicleView.dispose();
        }
        
    }
}
