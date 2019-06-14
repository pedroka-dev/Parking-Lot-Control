
package model.bo;

public class CarVersion {       //car version (e.g. sedan). One version can have many existing vehicles. 
    private String nameVersion;
    private String typeCombus;
    private String typeFuel;
    private int numberSeats;
    private boolean hasBrakeAbs;
    private boolean hasTransAuto;
    private CarModel carModel;
    

    public CarVersion(String nameVersion, String typeCombus, String typeFuel, int numberSeats, boolean hasBrakeAbs, boolean hasTransAuto, CarModel carModel) {
        this.nameVersion = nameVersion;
        this.typeCombus = typeCombus;
        this.typeFuel = typeFuel;
        this.numberSeats = numberSeats;
        this.hasBrakeAbs = hasBrakeAbs;
        this.hasTransAuto = hasTransAuto;
        this.carModel = carModel;
    }

    public CarVersion() {
        
    }

    
    public String getNameVersion() {
        return nameVersion;
    }

    public void setNameVersion(String nameVersion) {
        this.nameVersion = nameVersion;
    }

    public String getTypeCombus() {
        return typeCombus;
    }

    public void setTypeCombus(String typeCombus) {
        this.typeCombus = typeCombus;
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
        return "CarVersion{" + "nameVersion=" + nameVersion + 
                ", typeCombus=" + typeCombus + ", typeFuel=" + typeFuel + 
                ", numberSeats=" + numberSeats + ", hasBrakeAbs=" + hasBrakeAbs + 
                ", hasTransAuto=" + hasTransAuto + ", carModel=" + carModel + '}';
    }   
}
