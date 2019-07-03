
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.regCarVersionView.getjButtonExit()) {
            this.regCarVersionView.dispose();
        }
        
    }
}
