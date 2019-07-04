
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.CarVersion;
import service.CarVersionService;
import view.RegCarVersionView;


public class RegCarVersionControl implements ActionListener {
    
    private view.RegCarVersionView regCarVersionView;
    
    public RegCarVersionControl(RegCarVersionView regCarVersionView) {
        
        this.regCarVersionView = regCarVersionView;

        this.regCarVersionView.getjButtonSave().addActionListener(this);
        this.regCarVersionView.getjButtonExit().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.regCarVersionView.getjButtonSave()) {
            CarVersion carVersion = new CarVersion();
            
            int sizeList = 0;
            sizeList = CarVersionService.Retrieve().size();
            
            if ( sizeList != 0) {
                carVersion.setId(CarVersionService.Retrieve().get(sizeList - 1).getId() + 1);
            } else {
                carVersion.setId(1);
            }
            
            try{        //verifies if the var type is right
                Integer.parseInt(this.regCarVersionView.getjTxtNumberSeats().getText());
            }catch(NumberFormatException g){
               JOptionPane.showMessageDialog(null,"Please use only numbers for 'Number of Seats'");
               return;      //stops the function actionPerformed
            }
            
            carVersion.setNameVersion(this.regCarVersionView.getjTxtnNameVersion().getText());
            carVersion.setNumberSeats(Integer.parseInt(this.regCarVersionView.getjTxtNumberSeats().getText()));
            carVersion.setTypeFuel(this.regCarVersionView.getjTxtTypeFuel().getText());
            //carVersion.setHasBrakeAbs(this.regCarVersionView.getjComboHasBreakAbs().getSelectedItem());
            //carVersion.setHasTransAuto(this.regCarVersionView.getjComboHasTransAuto().getSelectedItem());
            service.CarVersionService.Create(carVersion);
        } 
        else if (e.getSource() == this.regCarVersionView.getjButtonExit()) {
            this.regCarVersionView.dispose();
        }
        
    }
}
