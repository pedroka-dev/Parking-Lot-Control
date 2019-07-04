
package service;

import java.util.List;
import model.bo.Entry;
import model.DAOSer.EntryDAOSer;

public class EntryService {
    public static void Create(Entry entry) {
        EntryDAOSer entryDAOSer = new EntryDAOSer();
        entryDAOSer.Create(entry);
        
    }

    public static Entry Retrieve(int id) {
        EntryDAOSer entryDAOSer = new EntryDAOSer();
        return entryDAOSer.Retrieve(id);
    }

    public static List<Entry> Retrieve() {
        EntryDAOSer entryDAOSer = new EntryDAOSer();
        return entryDAOSer.Retrieve();
    }

    public static void Update(int id, Entry entry) {
        EntryDAOSer entryDAO = new EntryDAOSer();
        entryDAO.Update(id, entry);
    }

    public static void Delete(int id) {
        EntryDAOSer entryDAO = new EntryDAOSer();
        entryDAO.Delete(id);
    }
}
