
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ListCarBrandView;


public class ListCarBrandControl implements ActionListener {
    
    private view.ListCarBrandView listCarBrandView;
    
    public ListCarBrandControl(ListCarBrandView listCarBrandView) {
        
        this.listCarBrandView = listCarBrandView;

        this.listCarBrandView.getjButtonEdit().addActionListener(this);
        this.listCarBrandView.getjButtonExit().addActionListener(this);
        this.listCarBrandView.getjButtonDelete().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listCarBrandView.getjButtonEdit()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.listCarBrandView.getjButtonExit()) {
            this.listCarBrandView.dispose();
        }
        else if (e.getSource() == this.listCarBrandView.getjButtonDelete()) {
            //desenvolver a codigifação da exclusao dos dados
        }
        
    }
}
