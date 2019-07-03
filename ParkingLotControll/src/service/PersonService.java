
package service;

import java.util.List;
import model.bo.Person;
import model.DAOSer.PersonDAOSer;

public class PersonService {
    public static void Create(Person person) {
        PersonDAOSer personDAOSer = new PersonDAOSer();
        personDAOSer.Create(person);
        
    }

    public static Person Retrieve(int id) {
        PersonDAOSer personDAOSer = new PersonDAOSer();
        return personDAOSer.Retrieve(id);
    }

    public static List<Person> Retrive() {
        PersonDAOSer personDAOSer = new PersonDAOSer();
        return personDAOSer.Retrieve();
    }

    public static void Update(int id, Person person) {
        PersonDAOSer personDAOSer = new PersonDAOSer();
        personDAOSer.Update(id, person);
    }

    public static void Delete(int id) {
        PersonDAOSer personDAO = new PersonDAOSer();
        personDAO.Delete(id);
    }
}
