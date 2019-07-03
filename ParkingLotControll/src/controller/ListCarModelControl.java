
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ListCarModelView;


public class ListCarModelControl implements ActionListener {
    
    private view.ListCarModelView listCarModelView;
    
    public ListCarModelControl(ListCarModelView listCarModelView) {
        
        this.listCarModelView = listCarModelView;

        this.listCarModelView.getjButtonEdit().addActionListener(this);
        this.listCarModelView.getjButtonExit().addActionListener(this);
        this.listCarModelView.getjButtonDelete().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listCarModelView.getjButtonEdit()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.listCarModelView.getjButtonExit()) {
            this.listCarModelView.dispose();
        }
        else if (e.getSource() == this.listCarModelView.getjButtonDelete()) {
            //desenvolver a codigifação da exclusao dos dados
        }
        
    }
}
