
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.Vehicle;
import service.VehicleService;
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
            Vehicle vehicle = new Vehicle();
            
            int sizeList = 0;
            sizeList = VehicleService.Retrieve().size();
            
            if ( sizeList != 0) {
                vehicle.setId(VehicleService.Retrieve().get(sizeList - 1).getId() + 1);
            } else {
                vehicle.setId(1);
            }
            vehicle.setNumberPlate(this.regVehicleView.getjTxtnNumberPlate().getText());
            vehicle.setEngineType(this.regVehicleView.getjTxtEngineType().getText());
            vehicle.setNameColor(this.regVehicleView.getjTxtNameColor().getText());
            vehicle.setYearFabrication(Integer.parseInt(this.regVehicleView.getjTxtYearFabrication().getText())); //possible error
            //vehicle.setPerson(this.regVehicleView.getjComboOwner().getSelectedItem());
            //vehicle.setCarVersion(this.regVehicleView.getjComboCarVersion().getSelectedItem());
            service.VehicleService.Create(vehicle);
        } 
        else if (e.getSource() == this.regVehicleView.getjButtonExit()) {
            this.regVehicleView.dispose();
        }
        
    }
}
