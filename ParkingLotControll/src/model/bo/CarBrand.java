
package model.bo;

public class CarBrand {   //car brand (e.g: ford). One brand can have many car models
    private String nameBrand;

    
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
