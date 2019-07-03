
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.regCarModelView.getjButtonExit()) {
            this.regCarModelView.dispose();
        }
        
    }
}
