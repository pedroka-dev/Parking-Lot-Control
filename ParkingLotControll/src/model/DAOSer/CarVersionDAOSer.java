package model.DAOSer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bo.CarVersion;

public class CarVersionDAOSer implements InterfaceDAOSer<CarVersion> {

    public static final String archiveSerialization = ".\\SerializeCarVersion.ser";

    @Override
    public void Create(CarVersion object) {
        //Instanciando Classe de serializeção
        Serialize serialize = new Serialize<CarVersion>();

        //Criando uma Lista de CarVersions, local
        List<CarVersion> listCarVersions = new ArrayList<CarVersion>();

        try {
            //Carregando os dados do archive de serializeção, para a list
                listCarVersions = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //adicionar a nova marca na list
        listCarVersions.add(object);

        //Utilizar o object serialize, para persistir o dado(list de marcas)
        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listCarVersions);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<CarVersion> Retrieve() {
        Serialize serialize = new Serialize<CarVersion>();
        //Criando uma Lista de CarVersions, local
        List<CarVersion> listCarVersions = new ArrayList<CarVersion>();
        
        try {
            //Carregando os dados do archive de serializeção, para a list
                listCarVersions = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listCarVersions;
    }

    @Override
    public CarVersion Retrieve(int id) {
        Serialize serialize = new Serialize<CarVersion>();
        List<CarVersion> listCarVersions = new ArrayList<>();

        try {
            listCarVersions = serialize.DeSerialize(archiveSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceCarVersion = listCarVersions.indexOf(id);
        if (indiceCarVersion != -1) {
            return listCarVersions.get(indiceCarVersion);
        } else {
            return null;
        }

    }

    @Override
    public void Update(int id, CarVersion object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete(int id) {
        Serialize serialize = new Serialize<CarVersion>();

        List<CarVersion> listCarVersion= new ArrayList<CarVersion>();

        try {
                listCarVersion = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        listCarVersion.remove(id);

        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listCarVersion);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
