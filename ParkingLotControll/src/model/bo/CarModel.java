
package model.bo;   

public class CarModel {     //car model (e.g: Camaro). One model can have many car version. Please do not confuse with "model.x" java packages
    private int id;
    private String nameModel;
    private String nameType;        //(e.g: Sedan, SUV, Pick-up)
    private String nameCategory;    //(e.g: A, B)
    private CarBrand carBrand;

   
    public String nameToString() {       //is used to show the entire name of the vehicle. 
        return carBrand.nameToString() + " " + nameModel;       //returns "BrandX ModelY"
    }

    public CarModel(int id, String nameModel, String nameType, String nameCategory, CarBrand carBrand) {
        this.id = id;
        this.nameModel = nameModel;
        this.nameType = nameType;
        this.nameCategory = nameCategory;
        this.carBrand = carBrand;
    }
    
    public CarModel() {
        
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "CarModel{" + "nameModel=" + nameModel +
                ", nameType=" + nameType + ", nameCategory=" + nameCategory + 
                ", carBrand=" + carBrand + '}';
    }

    

}
