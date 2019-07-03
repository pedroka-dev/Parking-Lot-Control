
package service;

import java.util.List;
import model.bo.CarModel;
import model.DAOSer.CarModelDAOSer;

public class CarModelService {
    public static void Create(CarModel carModel) {
        CarModelDAOSer carModelDAOSer = new CarModelDAOSer();
        carModelDAOSer.Create(carModel);
        
    }

    public static CarModel Retrieve(int id) {
        CarModelDAOSer carModelDAOSer = new CarModelDAOSer();
        return carModelDAOSer.Retrieve(id);
    }

    public static List<CarModel> Retrive() {
        CarModelDAOSer carModelDAOSer = new CarModelDAOSer();
        return carModelDAOSer.Retrieve();
    }

    public static void Update(int id, CarModel carModel) {
        CarModelDAOSer carModelDAO = new CarModelDAOSer();
        carModelDAO.Update(id, carModel);
    }

    public static void Delete(int id) {
        CarModelDAOSer carModelDAO = new CarModelDAOSer();
        carModelDAO.Delete(id);
    }
}
