package model.DAOSer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bo.Person;

public class PersonDAOSer implements InterfaceDAOSer<Person> {

    public static final String archiveSerialization = "C:\\Users\\Public\\Documents";

    @Override
    public void Create(Person object) {
        //Instanciando Classe de serializeção
        Serialize serialize = new Serialize<Person>();

        //Criando uma Lista de Persons, local
        List<Person> listPersons = new ArrayList<Person>();

        try {
            //Carregando os dados do archive de serializeção, para a list
                listPersons = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //adicionar a nova marca na list
        listPersons.add(object);

        //Utilizar o object serialize, para persistir o dado(list de marcas)
        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listPersons);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<Person> Retrieve() {
        Serialize serialize = new Serialize<Person>();
        //Criando uma Lista de Persons, local
        List<Person> listPersons = new ArrayList<Person>();
        
        try {
            //Carregando os dados do archive de serializeção, para a list
                listPersons = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listPersons;
    }

    @Override
    public Person Retrieve(int id) {
        Serialize serialize = new Serialize<Person>();
        List<Person> listPersons = new ArrayList<>();

        try {
            listPersons = serialize.DeSerialize(archiveSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indicePerson = listPersons.indexOf(id);
        if (indicePerson != -1) {
            return listPersons.get(indicePerson);
        } else {
            return null;
        }

    }

    @Override
    public void Update(int id, Person object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
