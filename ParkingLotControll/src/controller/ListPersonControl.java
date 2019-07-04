
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Person;
import view.ListPersonView;


public class ListPersonControl implements ActionListener {
    
    private view.ListPersonView listPersonView;
    
    public ListPersonControl(ListPersonView listPersonView) {
        
        this.listPersonView = listPersonView;

        this.listPersonView.getjButtonEdit().addActionListener(this);
        this.listPersonView.getjButtonExit().addActionListener(this);
        this.listPersonView.getjButtonDelete().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.listPersonView.getjTablePerson().getModel();
        for (Person personInstance : service.PersonService.Retrieve()) {
            tabela.addRow(new Object[]{personInstance.getId(), personInstance.getName(), 
               personInstance.getEmail(), personInstance.getNumberRg(),personInstance.getAdress()});
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listPersonView.getjButtonEdit()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.listPersonView.getjButtonExit()) {
            this.listPersonView.dispose();
        }
        else if (e.getSource() == this.listPersonView.getjButtonDelete()) {
            //desenvolver a codigifação da exclusao dos dados
        }
        
    }
}
