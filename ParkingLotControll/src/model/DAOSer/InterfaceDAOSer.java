package model.DAOSer;

import java.io.FileNotFoundException;
import java.util.List;

public interface InterfaceDAOSer <T>{

    public abstract void Create(T object ) ;
    public abstract List<T> Retrieve() ;
    public abstract T Retrieve(int id);
    public abstract void Update(int id, T object ) ;
    public abstract void Delete(int id) ;

}
