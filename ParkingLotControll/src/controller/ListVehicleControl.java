
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAOSer.VehicleDAOSer;
import model.bo.Vehicle;
import view.ListVehicleView;


public class ListVehicleControl implements ActionListener {
    
    private view.ListVehicleView listVehicleView;
    VehicleDAOSer vehicleDAOSer = new VehicleDAOSer();
    
    public ListVehicleControl(ListVehicleView listVehicleView) {
        
        this.listVehicleView = listVehicleView;

        this.listVehicleView.getjButtonEdit().addActionListener(this);
        this.listVehicleView.getjButtonExit().addActionListener(this);
        this.listVehicleView.getjButtonDelete().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.listVehicleView.getjTableVehicle().getModel();
        for (Vehicle vehicleInstance : service.VehicleService.Retrieve()) {
            tabela.addRow(new Object[]{vehicleInstance.getId(), vehicleInstance.getNumberPlate(),
                vehicleInstance.getNameColor(), vehicleInstance.getEngineType(), vehicleInstance.getYearFabrication()});
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.listVehicleView.getjButtonEdit()) {
            //desenvolver a codificação de carga do dado ppara a tela de cadastro
        } 
        else if (e.getSource() == this.listVehicleView.getjButtonExit()) {
            this.listVehicleView.dispose();
        }
        else if (e.getSource() == this.listVehicleView.getjButtonDelete()) {
            int id = this.listVehicleView.getjTableVehicle().getSelectedRow();
            if(id != -1) {
                vehicleDAOSer.Delete(id);
                this.listVehicleView.dispose();
            } 
        }      
    }
}
