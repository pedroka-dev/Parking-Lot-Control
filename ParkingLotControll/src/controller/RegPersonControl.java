
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.CarVersion;
import model.bo.Person;
import service.PersonService;
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
            Person person = new Person();
            
            int sizeList = 0;
            sizeList = PersonService.Retrieve().size();
            
            if ( sizeList != 0) {
                person.setId(PersonService.Retrieve().get(sizeList - 1).getId() + 1);
            } else {
                person.setId(1);
            }
            try{        //verifies if the var type is right
                Integer.parseInt(this.regPersonView.getjTxtNumberCpf().getText());
                Integer.parseInt(this.regPersonView.getjTxtPhone().getText());
            }catch(NumberFormatException g){
               JOptionPane.showMessageDialog(null,"Please use only numbers for 'Phone' or 'CPF'");
               return;      //stops the function actionPerformed
            }
            
            person.setName(this.regPersonView.getjTxtName().getText());
            person.setAdress(this.regPersonView.getjTxtAddress().getText());
            person.setEmail(this.regPersonView.getjTxtEmail().getText());
            person.setNumberCpf(Integer.parseInt(this.regPersonView.getjTxtNumberCpf().getText()));
            person.setNumberRg(this.regPersonView.getjTxtNumberRg().getText());
            person.setPhone(Integer.parseInt(this.regPersonView.getjTxtPhone().getText()));
            service.PersonService.Create(person);
        } 
        else if (e.getSource() == this.regPersonView.getjButtonExit()) {
            this.regPersonView.dispose();
        }
        
    }
}
