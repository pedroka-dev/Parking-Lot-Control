
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.CarVersion;
import model.bo.Person;
import model.bo.Vehicle;
import service.VehicleService;
import view.RegVehicleView;


public class RegVehicleControl implements ActionListener {
    
    private view.RegVehicleView regVehicleView;
    
    public RegVehicleControl(RegVehicleView regVehicleView) {
        
        this.regVehicleView = regVehicleView;

        this.regVehicleView.getjButtonSave().addActionListener(this);
        this.regVehicleView.getjButtonExit().addActionListener(this);
        
        for (CarVersion carVersionInstance : service.CarVersionService.Retrieve()) { 
            regVehicleView.getjComboCarVersion().addItem( carVersionInstance.getNameVersion());
        }
        
        for (Person personInstance : service.PersonService.Retrieve()) { 
            regVehicleView.getjComboOwner().addItem( personInstance.getName());
        }
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
            
            
            try{        //verifies if the var type is right
                Integer.parseInt(this.regVehicleView.getjTxtYearFabrication().getText());   
            }catch(NumberFormatException g){
               JOptionPane.showMessageDialog(null,"Please use only numbers for 'Year of Fabrication'");
               return;      //stops the function actionPerformed
            }
            
            if(this.regVehicleView.getjComboOwner().getSelectedIndex() == 0){  //check if the option is valid
               JOptionPane.showMessageDialog(null,"Please Select an already registered 'Owner/Person'");
               return;      //stops the function actionPerformed
            }
            else{
                vehicle.setPerson(service.PersonService.Retrieve(this.regVehicleView.getjComboOwner().getSelectedIndex()-1));
                //sets CarBrand based on the index of the combobox - 1
            }
            
            if(this.regVehicleView.getjComboCarVersion().getSelectedIndex() == 0){  //check if the option is valid
               JOptionPane.showMessageDialog(null,"Please Select an already registered 'Version'");
               return;      //stops the function actionPerformed
            }
            else{
                vehicle.setCarVersion(service.CarVersionService.Retrieve(this.regVehicleView.getjComboCarVersion().getSelectedIndex()-1));
                //sets CarBrand based on the index of the combobox - 1
            }
            
            vehicle.setNumberPlate(this.regVehicleView.getjTxtnNumberPlate().getText());
            vehicle.setEngineType(this.regVehicleView.getjTxtEngineType().getText());
            vehicle.setNameColor(this.regVehicleView.getjTxtNameColor().getText());
            vehicle.setYearFabrication(Integer.parseInt(this.regVehicleView.getjTxtYearFabrication().getText()));
            service.VehicleService.Create(vehicle);
        } 
        else if (e.getSource() == this.regVehicleView.getjButtonExit()) {
            this.regVehicleView.dispose();
        }
        
    }
}
