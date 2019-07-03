
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RegPersonView;


public class RegPersonControl implements ActionListener {
    
    private view.RegPersonView regPersonView;
    
    public RegPersonControl(RegPersonView regPersonView) {
        
        this.regPersonView = regPersonView;

        this.regPersonView.getjButtonSave().addActionListener(this);
        this.regPersonView.getjButtonExit().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.regPersonView.getjButtonSave()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.regPersonView.getjButtonExit()) {
            this.regPersonView.dispose();
        }
        
    }
}
