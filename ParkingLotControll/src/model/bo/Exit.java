
package model.bo;

import java.io.Serializable;

public class Exit implements Serializable {
    private int id;
    private String numberPlate;
    private String dateExit;
    private String hourExit;

    public Exit(int id, String numberPlate, String dateExit, String hourExit) {
        this.id = id;
        this.numberPlate = numberPlate;
        this.dateExit = dateExit;
        this.hourExit = hourExit;
    }

    public Exit() {
        
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
    
    public String getDateExit() {
        return dateExit;
    }

    public void setDateExit(String dateExit) {
        this.dateExit = dateExit;
    }

    public String getHourExit() {
        return hourExit;
    }

    public void setHourExit(String hourExit) {
        this.hourExit = hourExit;
    }

    
    @Override
    public String toString() {
        return "Exit{" + "dateExit=" + dateExit + ", hourExit=" + hourExit + '}';
    }
}
