package model.DAOSer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bo.CarBrand;

public class CarBrandDAOSer implements InterfaceDAOSer<CarBrand> {

    public static final String archiveSerialization = "C:\\Users\\Public\\Documents";

    @Override
    public void Create(CarBrand object) {
        //Instanciando Classe de serializeção
        Serialize serialize = new Serialize<CarBrand>();

        //Criando uma Lista de CarBrands, local
        List<CarBrand> listCarBrands = new ArrayList<CarBrand>();

        try {
            //Carregando os dados do archive de serializeção, para a list
                listCarBrands = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //adicionar a nova marca na list
        listCarBrands.add(object);

        //Utilizar o object serialize, para persistir o dado(list de marcas)
        try {
            serialize.Serialize(archiveSerialization, (ArrayList) listCarBrands);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<CarBrand> Retrieve() {
        Serialize serialize = new Serialize<CarBrand>();
        //Criando uma Lista de CarBrands, local
        List<CarBrand> listCarBrands = new ArrayList<CarBrand>();
        
        try {
            //Carregando os dados do archive de serializeção, para a list
                listCarBrands = serialize.DeSerialize(archiveSerialization);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listCarBrands;
    }

    @Override
    public CarBrand Retrieve(int id) {
        Serialize serialize = new Serialize<CarBrand>();
        List<CarBrand> listCarBrands = new ArrayList<>();

        try {
            listCarBrands = serialize.DeSerialize(archiveSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceCarBrand = listCarBrands.indexOf(id);
        if (indiceCarBrand != -1) {
            return listCarBrands.get(indiceCarBrand);
        } else {
            return null;
        }

    }

    @Override
    public void Update(int id, CarBrand object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
