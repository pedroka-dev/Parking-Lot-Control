package model.DAOSer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bo.CarModel;

public class CarModelDAOSer implements InterfaceDAOSer<CarModel> {

    public static final String archiveSerialization = ".\\SerializeCarModel.ser";

    @Override
    public void Create(CarModel object) {
        //Instanciando Classe de serializeção
        Serialize serialize = new Serialize<CarModel>();

        //Criando uma Lista de CarModels, local
        List<CarModel> listCarModels = new ArrayList<CarModel>();

        try {
            //Carregando os dados do archive de serializeção, para a list
                listCarModels = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //adicionar a nova marca na list
        listCarModels.add(object);

        //Utilizar o object serialize, para persistir o dado(list de marcas)
        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listCarModels);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<CarModel> Retrieve() {
        Serialize serialize = new Serialize<CarModel>();
        //Criando uma Lista de CarModels, local
        List<CarModel> listCarModels = new ArrayList<CarModel>();
        
        try {
            //Carregando os dados do archive de serializeção, para a list
                listCarModels = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listCarModels;
    }

    @Override
    public CarModel Retrieve(int id) {
        Serialize serialize = new Serialize<CarModel>();
        List<CarModel> listCarModels = new ArrayList<>();

        try {
            listCarModels = serialize.DeSerialize(archiveSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceCarModel = listCarModels.indexOf(id);
        if (indiceCarModel != -1) {
            return listCarModels.get(indiceCarModel);
        } else {
            return null;
        }

    }

    @Override
    public void Update(int id, CarModel object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete(int id) {
        Serialize serialize = new Serialize<CarModel>();

        List<CarModel> listCarModels = new ArrayList<CarModel>();

        try {
                listCarModels = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        listCarModels.remove(id);

        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listCarModels);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
