
package model.bo;   

public class CarModel {     //car model (e.g: camaro). One model can have many car version. Please do not confuse with "model.x" java packages
    private String nameModel;
    private String nameClass;
    private String nameType;
    private CarBrand carBrand;

    
    public CarModel(String nameModel, String nameClass, String nameType, CarBrand carBrand) {
        this.nameModel = nameModel;
        this.nameClass = nameClass;
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

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
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
                ", nameClass=" + nameClass + ", nameType=" + nameType + 
                ", carBrand=" + carBrand + '}';
    }
}
