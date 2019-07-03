
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.regCarBrandView.getjButtonExit()) {
            this.regCarBrandView.dispose();
        }
        
    }
}
