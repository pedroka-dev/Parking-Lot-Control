package model.DAOSer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bo.Entry;

public class EntryDAOSer implements InterfaceDAOSer<Entry> {

    public static final String archiveSerialization = "C:\\Users\\Bleyc\\Documents\\SerializeEntry.ser";

    @Override
    public void Create(Entry object) {
        //Instanciando Classe de serializeção
        Serialize serialize = new Serialize<Entry>();

        //Criando uma Lista de Entrys, local
        List<Entry> listEntrys = new ArrayList<Entry>();

        try {
            //Carregando os dados do archive de serializeção, para a list
                listEntrys = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //adicionar a nova marca na list
        listEntrys.add(object);

        //Utilizar o object serialize, para persistir o dado(list de marcas)
        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listEntrys);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<Entry> Retrieve() {
        Serialize serialize = new Serialize<Entry>();
        //Criando uma Lista de Entrys, local
        List<Entry> listEntrys = new ArrayList<Entry>();
        
        try {
            //Carregando os dados do archive de serializeção, para a list
                listEntrys = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listEntrys;
    }

    @Override
    public Entry Retrieve(int id) {
        Serialize serialize = new Serialize<Entry>();
        List<Entry> listEntrys = new ArrayList<>();

        try {
            listEntrys = serialize.DeSerialize(archiveSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceEntry = listEntrys.indexOf(id);
        if (indiceEntry != -1) {
            return listEntrys.get(indiceEntry);
        } else {
            return null;
        }

    }

    @Override
    public void Update(int id, Entry object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
