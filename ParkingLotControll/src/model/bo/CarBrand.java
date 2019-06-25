
package model.bo;

public class CarBrand {   //car brand (e.g: Ford). One brand can have many car models
    private String nameBrand;

    
    public String nameToString() {       //is used to show the entire name of the vehicle. 
        return nameBrand;
    }
    
    
    public CarBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }
    
    public CarBrand() { 
    }

    
    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    
    @Override
    public String toString() {
        return "CarBrand{" + "nameBrand=" + nameBrand + '}';
    }
}
