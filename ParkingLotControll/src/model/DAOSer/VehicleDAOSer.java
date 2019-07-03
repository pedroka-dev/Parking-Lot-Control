package model.DAOSer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bo.Vehicle;

public class VehicleDAOSer implements InterfaceDAOSer<Vehicle> {

    public static final String archiveSerialization = "C:\\Users\\Public\\Documents";

    @Override
    public void Create(Vehicle object) {
        //Instanciando Classe de serializeção
        Serialize serialize = new Serialize<Vehicle>();

        //Criando uma Lista de Vehicles, local
        List<Vehicle> listVehicles = new ArrayList<Vehicle>();

        try {
            //Carregando os dados do archive de serializeção, para a list
                listVehicles = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //adicionar a nova marca na list
        listVehicles.add(object);

        //Utilizar o object serialize, para persistir o dado(list de marcas)
        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listVehicles);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<Vehicle> Retrieve() {
        Serialize serialize = new Serialize<Vehicle>();
        //Criando uma Lista de Vehicles, local
        List<Vehicle> listVehicles = new ArrayList<Vehicle>();
        
        try {
            //Carregando os dados do archive de serializeção, para a list
                listVehicles = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listVehicles;
    }

    @Override
    public Vehicle Retrieve(int id) {
        Serialize serialize = new Serialize<Vehicle>();
        List<Vehicle> listVehicles = new ArrayList<>();

        try {
            listVehicles = serialize.DeSerialize(archiveSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceVehicle = listVehicles.indexOf(id);
        if (indiceVehicle != -1) {
            return listVehicles.get(indiceVehicle);
        } else {
            return null;
        }

    }

    @Override
    public void Update(int id, Vehicle object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
