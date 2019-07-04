
package model.bo;

import java.io.Serializable;

public class Entry implements Serializable{
    private int id;
    private String numberPlate;
    private String dateEntry;
    private String hourEntry;

    public Entry(int id, String numberPlate, String dateEntry, String hourEntry) {
        this.id = id;
        this.numberPlate = numberPlate;
        this.dateEntry = dateEntry;
        this.hourEntry = hourEntry;
    }

    public Entry(){
        
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(String dateEntry) {
        this.dateEntry = dateEntry;
    }

    public String getHourEntry() {
        return hourEntry;
    }

    public void setHourEntry(String hourEntry) {
        this.hourEntry = hourEntry;
    }

    
    @Override
    public String toString() {
        return "Entry{" + "dateEntry=" + dateEntry + ", hourEntry=" + hourEntry + '}';
    }
}
