
package model.bo;

import java.io.Serializable;

public class CarVersion implements Serializable {       //car version (e.g. Z/28). One version can have many existing vehicles. 
    private int id;
    private String nameVersion;
    private String typeFuel;
    private int numberSeats;
    private boolean hasBrakeAbs;
    private boolean hasTransAuto;
    private CarModel carModel;
    
    
    public String nameToString() {       //is used to show the entire name of the vehicle. 
        return carModel.nameToString() + " " + nameVersion;       //returns "BrandX ModelY VersionZ"
    }

    public CarVersion(int id, String nameVersion, String typeFuel, int numberSeats, boolean hasBrakeAbs, boolean hasTransAuto, CarModel carModel) {
        this.id = id;
        this.nameVersion = nameVersion;
        this.typeFuel = typeFuel;
        this.numberSeats = numberSeats;
        this.hasBrakeAbs = hasBrakeAbs;
        this.hasTransAuto = hasTransAuto;
        this.carModel = carModel;
    }

    public CarVersion() {
        
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameVersion() {
        return nameVersion;
    }

    public void setNameVersion(String nameVersion) {
        this.nameVersion = nameVersion;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public boolean isHasBrakeAbs() {
        return hasBrakeAbs;
    }

    public void setHasBrakeAbs(boolean hasBrakeAbs) {
        this.hasBrakeAbs = hasBrakeAbs;
    }

    public boolean isHasTransAuto() {
        return hasTransAuto;
    }

    public void setHasTransAuto(boolean hasTransAuto) {
        this.hasTransAuto = hasTransAuto;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    
    @Override
    public String toString() {
        return "CarVersion{" + "nameVersion=" + nameVersion + ", typeFuel=" + typeFuel + 
                ", numberSeats=" + numberSeats + ", hasBrakeAbs=" + hasBrakeAbs + 
                ", hasTransAuto=" + hasTransAuto + ", carModel=" + carModel + '}';
    }   
}
