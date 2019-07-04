
package service;

import java.util.List;
import model.bo.Exit;
import model.DAOSer.ExitDAOSer;

public class ExitService {
    public static void Create(Exit exit) {
        ExitDAOSer exitDAOSer = new ExitDAOSer();
        exitDAOSer.Create(exit);
        
    }

    public static Exit Retrieve(int id) {
        ExitDAOSer exitDAOSer = new ExitDAOSer();
        return exitDAOSer.Retrieve(id);
    }

    public static List<Exit> Retrieve() {
        ExitDAOSer exitDAOSer = new ExitDAOSer();
        return exitDAOSer.Retrieve();
    }

    public static void Update(int id, Exit exit) {
        ExitDAOSer exitDAO = new ExitDAOSer();
        exitDAO.Update(id, exit);
    }

    public static void Delete(int id) {
        ExitDAOSer exitDAO = new ExitDAOSer();
        exitDAO.Delete(id);
    }
}
