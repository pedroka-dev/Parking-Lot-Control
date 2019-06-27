
package model.bo;

public class Vehicle {
    private String nameColor;
    private String numberPlate;
    private String engineType;      //(e.g. 1.0, 1.5)
    private int yearFabrication;
    private CarVersion carVersion;
    private Person Person;

    public Vehicle(String nameColor, String numberPlate, String engineType, int yearFabrication, CarVersion carVersion, Person Person) {
        this.nameColor = nameColor;
        this.numberPlate = numberPlate;
        this.engineType = engineType;
        this.yearFabrication = yearFabrication;
        this.carVersion = carVersion;
        this.Person = Person;
    }

    public Vehicle() {
        
    }
    
    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public int getYearFabrication() {
        return yearFabrication;
    }

    public void setYearFabrication(int yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

    public CarVersion getCarVersion() {
        return carVersion;
    }

    public void setCarVersion(CarVersion carVersion) {
        this.carVersion = carVersion;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Person getPerson() {
        return Person;
    }

    public void setPerson(Person Person) {
        this.Person = Person;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "nameColor=" + nameColor + 
                ", numberPlate=" + numberPlate + ", engineType=" + engineType + 
                ", yearFabrication=" + yearFabrication + ", carVersion=" + carVersion + 
                ", Person=" + Person + '}';
    }
    
    
    
}
