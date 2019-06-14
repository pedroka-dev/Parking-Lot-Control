
package model.bo;

public class Vehicle {
    private String nameColor;
    private int numberPlate;
    private int yearFabrication;
    private int numberChassis;
    private CarVersion carVersion;
    private Entry entry;
    private Exit exit;
    private LegalPerson legalPerson;
    private NaturalPerson naturalPerson;

    
    public Vehicle(String nameColor, int numberPlate, int yearFabrication, int numberChassis, CarVersion carVersion, Entry entry, Exit exit, LegalPerson legalPerson, NaturalPerson naturalPerson) {
        this.nameColor = nameColor;
        this.numberPlate = numberPlate;
        this.yearFabrication = yearFabrication;
        this.numberChassis = numberChassis;
        this.carVersion = carVersion;
        this.entry = entry;
        this.exit = exit;
        this.legalPerson = legalPerson;
        this.naturalPerson = naturalPerson;
    }
    
    public Vehicle() {
        
    }
    
    
    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public int getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getYearFabrication() {
        return yearFabrication;
    }

    public void setYearFabrication(int yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

    public int getNumberChassis() {
        return numberChassis;
    }

    public void setNumberChassis(int numberChassis) {
        this.numberChassis = numberChassis;
    }

    public CarVersion getCarVersion() {
        return carVersion;
    }

    public void setCarVersion(CarVersion carVersion) {
        this.carVersion = carVersion;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public Exit getExit() {
        return exit;
    }

    public void setExit(Exit exit) {
        this.exit = exit;
    }

    public LegalPerson getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(LegalPerson legalPerson) {
        this.legalPerson = legalPerson;
    }

    public NaturalPerson getNaturalPerson() {
        return naturalPerson;
    }

    public void setNaturalPerson(NaturalPerson naturalPerson) {
        this.naturalPerson = naturalPerson;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "nameColor=" + nameColor + 
                ", numberPlate=" + numberPlate + ", yearFabrication=" + yearFabrication + 
                ", numberChassis=" + numberChassis + ", carVersion=" + carVersion + 
                ", entry=" + entry + ", exit=" + exit + ", legalPerson=" + legalPerson + 
                ", naturalPerson=" + naturalPerson + '}';
    }
}
