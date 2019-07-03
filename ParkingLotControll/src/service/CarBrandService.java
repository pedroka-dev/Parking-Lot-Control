
package service;

import java.util.List;
import model.bo.CarBrand;
import model.DAOSer.CarBrandDAOSer;

public class CarBrandService {
    public static void Create(CarBrand carBrand) {
        CarBrandDAOSer carBrandDAOSer = new CarBrandDAOSer();
        carBrandDAOSer.Create(carBrand);
        
    }

    public static CarBrand Retrieve(int id) {
        CarBrandDAOSer carBrandDAOSer = new CarBrandDAOSer();
        return carBrandDAOSer.Retrieve(id);
    }

    public static List<CarBrand> Retrieve() {
        CarBrandDAOSer carBrandDAOSer = new CarBrandDAOSer();
        return carBrandDAOSer.Retrieve();
    }

    public static void Update(int id, CarBrand carBrand) {
        CarBrandDAOSer carBrandDAO = new CarBrandDAOSer();
        carBrandDAO.Update(id, carBrand);
    }

    public static void Delete(int id) {
        CarBrandDAOSer carBrandDAO = new CarBrandDAOSer();
        carBrandDAO.Delete(id);
    }
}
