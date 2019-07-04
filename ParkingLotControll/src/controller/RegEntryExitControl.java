
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.CarBrand;
import model.bo.Entry;
import model.bo.Exit;
import model.bo.Vehicle;
import service.CarBrandService;
import service.EntryService;
import service.ExitService;
import service.VehicleService;
import view.RegCarBrandView;
import view.RegEntryExitView;


public class RegEntryExitControl implements ActionListener {
    
    private view.RegEntryExitView regEntryExitView;
    
    public RegEntryExitControl(RegEntryExitView regEntryExitView) {
        
        this.regEntryExitView = regEntryExitView;

        this.regEntryExitView.getjButtonSave().addActionListener(this);
        this.regEntryExitView.getjButtonExit().addActionListener(this);
        
        for (Vehicle vehicleInstance : service.VehicleService.Retrieve()) { 
            regEntryExitView.getjComboBoxVehicle().addItem( vehicleInstance.getNumberPlate());
        }  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.regEntryExitView.getjButtonSave()) {
            if(this.regEntryExitView.getjComboBoxVehicle().getSelectedIndex() == 0){  //check if the option is valid
               JOptionPane.showMessageDialog(null,"Please Select an already registered 'Vehicle'");
               return;      //stops the function actionPerformed
            }
            Exit exit = new Exit();
            Entry entry = new Entry(); 
            int sizeList = 0;
            
            if(this.regEntryExitView.getjComboBoxOperation().getSelectedIndex() == 0) {
                sizeList = EntryService.Retrieve().size();
                if ( sizeList != 0) {
                    entry.setId(EntryService.Retrieve().get(sizeList - 1).getId() + 1);
                } else {
                    entry.setId(1);
                }
                //entry.setNumberPlate(service.VehicleService.Retrieve(this.regEntryExitView.getjComboBoxVehicle().getSelectedIndex()-1).getNumberPlate());
                for(Vehicle atual : VehicleService.Retrieve()){
                    if(this.regEntryExitView.getjComboBoxVehicle().getSelectedItem().toString().equalsIgnoreCase(atual.getNumberPlate())){
                        entry.setNumberPlate(atual.getNumberPlate());
                    }
                }
                entry.setDateEntry("0");
                entry.setHourEntry("0");
                service.EntryService.Create(entry);
            }
            else {
                sizeList = ExitService.Retrieve().size();
                if ( sizeList != 0) {
                    exit.setId(ExitService.Retrieve().get(sizeList - 1).getId() + 1);
                } else {
                    exit.setId(1);
                }
                for(Vehicle atual : VehicleService.Retrieve()){
                    if(this.regEntryExitView.getjComboBoxVehicle().getSelectedItem().toString().equalsIgnoreCase(atual.getNumberPlate())){
                        exit.setNumberPlate(atual.getNumberPlate());
                    }
                }
                //exit.setNumberPlate(service.VehicleService.Retrieve(this.regEntryExitView.getjComboBoxVehicle().getSelectedIndex()-1).getNumberPlate());
                exit.setDateExit("0");
                exit.setHourExit("0");
                service.ExitService.Create(exit);
            }
            
            
        } 
        
        else if (e.getSource() == this.regEntryExitView.getjButtonExit()) {
            this.regEntryExitView.dispose();
        }
    }
}
