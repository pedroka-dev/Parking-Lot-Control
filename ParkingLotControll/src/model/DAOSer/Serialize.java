package model.DAOSer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Serialize<T> implements Serializable {

    public void Serialize(String file, ArrayList<T> list) throws FileNotFoundException, IOException {
        FileOutputStream fileSerialize = new FileOutputStream(file);
        ObjectOutputStream objMemory = new ObjectOutputStream(fileSerialize);
        objMemory.writeObject(list);
        objMemory.close();
        fileSerialize.close();
    }

    public ArrayList<T> DeSerialize(String file) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<T> list = new ArrayList<T>();
        FileInputStream fileDeSerealiza = new FileInputStream(file);
        ObjectInputStream objMemory = new ObjectInputStream(fileDeSerealiza);
        list = (ArrayList<T>) objMemory.readObject();
        objMemory.close();
        fileDeSerealiza.close();
        return list;
    }
}
