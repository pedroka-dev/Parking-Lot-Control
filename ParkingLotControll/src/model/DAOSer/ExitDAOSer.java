package model.DAOSer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bo.Exit;

public class ExitDAOSer implements InterfaceDAOSer<Exit> {

    public static final String archiveSerialization = ".\\SerializeExit.ser";

    @Override
    public void Create(Exit object) {
        //Instanciando Classe de serializeção
        Serialize serialize = new Serialize<Exit>();

        //Criando uma Lista de Exits, local
        List<Exit> listExits = new ArrayList<Exit>();

        try {
            //Carregando os dados do archive de serializeção, para a list
                listExits = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //adicionar a nova marca na list
        listExits.add(object);

        //Utilizar o object serialize, para persistir o dado(list de marcas)
        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listExits);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<Exit> Retrieve() {
        Serialize serialize = new Serialize<Exit>();
        //Criando uma Lista de Exits, local
        List<Exit> listExits = new ArrayList<Exit>();
        
        try {
            //Carregando os dados do archive de serializeção, para a list
                listExits = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listExits;
    }

    @Override
    public Exit Retrieve(int id) {
        Serialize serialize = new Serialize<Exit>();
        List<Exit> listExits = new ArrayList<>();

        try {
            listExits = serialize.DeSerialize(archiveSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceExit = listExits.indexOf(id);
        if (indiceExit != -1) {
            return listExits.get(indiceExit);
        } else {
            return null;
        }

    }

    @Override
    public void Update(int id, Exit object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete(int id) {
        Serialize serialize = new Serialize<Exit>();

        List<Exit> listExit= new ArrayList<Exit>();

        try {
                listExit = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        listExit.remove(id);

        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listExit);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
