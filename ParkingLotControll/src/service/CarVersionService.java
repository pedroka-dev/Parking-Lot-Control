
package service;

import java.util.List;
import model.bo.CarVersion;
import model.DAOSer.CarVersionDAOSer;

public class CarVersionService {
    public static void Create(CarVersion carVersion) {
        CarVersionDAOSer carVersionDAOSer = new CarVersionDAOSer();
        carVersionDAOSer.Create(carVersion);
        
    }

    public static CarVersion Retrieve(int id) {
        CarVersionDAOSer carVersionDAOSer = new CarVersionDAOSer();
        return carVersionDAOSer.Retrieve(id);
    }

    public static List<CarVersion> Retrieve() {
        CarVersionDAOSer carVersionDAOSer = new CarVersionDAOSer();
        return carVersionDAOSer.Retrieve();
    }

    public static void Update(int id, CarVersion carVersion) {
        CarVersionDAOSer carVersionDAOSer = new CarVersionDAOSer();
        carVersionDAOSer.Update(id, carVersion);
    }

    public static void Delete(int id) {
        CarVersionDAOSer carVersionDAO = new CarVersionDAOSer();
        carVersionDAO.Delete(id);
    }
}
