
package model.bo;   

public class CarModel {     //car model (e.g: Camaro). One model can have many car version. Please do not confuse with "model.x" java packages
    private String nameModel;
    private String nameType;        //(e.g: Sedan, SUV, Pick-up)
    private CarBrand carBrand;

   
    public String nameToString() {       //is used to show the entire name of the vehicle. 
        return carBrand.nameToString() + " " + nameModel;       //returns "BrandX ModelY"
    }
    
    
    public CarModel(String nameModel, String nameType, CarBrand carBrand) {
        this.nameModel = nameModel;
        this.nameType = nameType;
        this.carBrand = carBrand;
    }
    
    public CarModel() {
        
    }

    
    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    
    @Override
    public String toString() {
        return "CarModel{" + "nameModel=" + nameModel + 
                ", nameType=" + nameType + ", carBrand=" + carBrand + '}';
    }
}
