
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.CarBrand;
import model.bo.CarModel;
import service.CarModelService;
import view.RegCarModelView;


public class RegCarModelControl implements ActionListener {
    
    private view.RegCarModelView regCarModelView;
    
    public RegCarModelControl(RegCarModelView regCarModelView) {
        
        this.regCarModelView = regCarModelView;

        this.regCarModelView.getjButtonSave().addActionListener(this);
        this.regCarModelView.getjButtonExit().addActionListener(this);
        
        for (CarBrand carBrandInstance : service.CarBrandService.Retrieve()) { 
            regCarModelView.getjComboCarBrand().addItem( carBrandInstance.getNameBrand() );
        }   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.regCarModelView.getjButtonSave()) {
            CarModel carModel = new CarModel();
            
            int sizeList = 0;
            sizeList = CarModelService.Retrieve().size();
            
            if ( sizeList != 0) {
                carModel.setId(CarModelService.Retrieve().get(sizeList - 1).getId() + 1);
            } else {
                carModel.setId(1);
            }
            
            
            if(this.regCarModelView.getjComboCarBrand().getSelectedIndex() == 0){  //check if the option is valid
               JOptionPane.showMessageDialog(null,"Please Select an already registered 'Brand'");
               return;      //stops the function actionPerformed
            }
            else{
                carModel.setCarBrand(service.CarBrandService.Retrieve(this.regCarModelView.getjComboCarBrand().getSelectedIndex()-1));
                //sets CarBrand based on the index of the combobox - 1
            }
            
            carModel.setNameModel(this.regCarModelView.getjTxtModelName().getText());
            carModel.setNameCategory(this.regCarModelView.getjTxtNameCategory().getText());
            carModel.setNameType(this.regCarModelView.getjTxtNameType().getText());
            service.CarModelService.Create(carModel);
        } 
        else if (e.getSource() == this.regCarModelView.getjButtonExit()) {
            this.regCarModelView.dispose();
        }
        
    }
}
