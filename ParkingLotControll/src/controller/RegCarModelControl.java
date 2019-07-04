
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.CarModel;
import service.CarModelService;
import view.RegCarModelView;


public class RegCarModelControl implements ActionListener {
    
    private view.RegCarModelView regCarModelView;
    
    public RegCarModelControl(RegCarModelView regCarModelView) {
        
        this.regCarModelView = regCarModelView;

        this.regCarModelView.getjButtonSave().addActionListener(this);
        this.regCarModelView.getjButtonExit().addActionListener(this);
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
            carModel.setNameModel(this.regCarModelView.getjTxtModelName().getText());
            carModel.setNameCategory(this.regCarModelView.getjTxtNameCategory().getText());
            //carModel.setCarBrand(this.regCarModelView.getjComboCarBrand().getSelectedItem());
            carModel.setNameType(this.regCarModelView.getjTxtNameType().getText());
            service.CarModelService.Create(carModel);
        } 
        else if (e.getSource() == this.regCarModelView.getjButtonExit()) {
            this.regCarModelView.dispose();
        }
        
    }
}
