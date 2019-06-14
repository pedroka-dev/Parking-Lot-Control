
package model.bo;

public class Exit {
    private String dateExit;
    private String hourExit;

    
    public Exit(String dateExit, String hourExit) {
        this.dateExit = dateExit;
        this.hourExit = hourExit;
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
