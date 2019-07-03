
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.CarBrand;
import service.CarBrandService;
import view.RegCarBrandView;


public class RegCarBrandControl implements ActionListener {
    
    private view.RegCarBrandView regCarBrandView;
    
    public RegCarBrandControl(RegCarBrandView regCarBrandView) {
        
        this.regCarBrandView = regCarBrandView;

        this.regCarBrandView.getjButtonSave().addActionListener(this);
        this.regCarBrandView.getjButtonExit().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.regCarBrandView.getjButtonSave()) {
            CarBrand carBrand = new CarBrand();
            
            int sizeList = 0;
            sizeList = CarBrandService.Retrieve().size();
            
            if ( sizeList != 0) {
                carBrand.setId(CarBrandService.Retrieve().get(sizeList - 1).getId() + 1);
            } else {
                carBrand.setId(1);
            }
            carBrand.setNameBrand(this.regCarBrandView.getjTxtBrandName());
            service.CarBrandService.Create(carBrand);
        } 
        
        else if (e.getSource() == this.regCarBrandView.getjButtonExit()) {
            this.regCarBrandView.dispose();
        }
    }
}
