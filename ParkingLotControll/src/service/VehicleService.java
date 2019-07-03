
package service;

import java.util.List;
import model.bo.Vehicle;
import model.DAOSer.VehicleDAOSer;

public class VehicleService {
    public static void Create(Vehicle vehicle) {
        VehicleDAOSer vehicleDAOSer = new VehicleDAOSer();
        vehicleDAOSer.Create(vehicle);
        
    }

    public static Vehicle Retrieve(int id) {
        VehicleDAOSer vehicleDAOSer = new VehicleDAOSer();
        return vehicleDAOSer.Retrieve(id);
    }

    public static List<Vehicle> Buscar() {
        VehicleDAOSer vehicleDAOSer = new VehicleDAOSer();
        return vehicleDAOSer.Retrieve();
    }

    public static void Update(int id, Vehicle vehicle) {
        VehicleDAOSer vehicleDAOSer = new VehicleDAOSer();
        vehicleDAOSer.Update(id, vehicle);
    }

    public static void Delete(int id) {
        VehicleDAOSer vehicleDAO = new VehicleDAOSer();
        vehicleDAO.Delete(id);
    }
}
