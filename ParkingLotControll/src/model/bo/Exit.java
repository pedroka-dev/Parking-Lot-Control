
package model.bo;

public class Exit {
    private int id;
    private String dateExit;
    private String hourExit;

    public Exit(int id, String dateExit, String hourExit) {
        this.id = id;
        this.dateExit = dateExit;
        this.hourExit = hourExit;
    }

    public Exit() {
        
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
