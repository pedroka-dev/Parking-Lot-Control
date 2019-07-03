
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            person.setName(this.regPersonView.getjTxtName().getText());
            person.setAdress(this.regPersonView.getjTxtAddress().getText());
            person.setEmail(this.regPersonView.getjTxtEmail().getText());
            person.setNumberCpf(Integer.parseInt(this.regPersonView.getjTxtNumberCpf().getText()));
            person.setNumberRg(this.regPersonView.getjTxtNumberRg().getText());
            person.setPhone(Integer.parseInt(this.regPersonView.getjTxtPhone().getText())); //possible error
            service.PersonService.Create(person);
        } 
        else if (e.getSource() == this.regPersonView.getjButtonExit()) {
            this.regPersonView.dispose();
        }
        
    }
}
