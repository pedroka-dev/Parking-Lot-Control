
package model.bo;

public class CarBrand {   //car brand (e.g: Ford). One brand can have many car models
    private int id;
    private String nameBrand;

    
    public String nameToString() {       //is used to show the entire name of the vehicle. 
        return nameBrand;
    }

    public CarBrand(int id, String nameBrand) {
        this.id = id;
        this.nameBrand = nameBrand;
    }

    public CarBrand() { 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
