
package model.bo;

public class Entry {
    private String dateEntry;
    private String hourEntry;

    
    public Entry(String dateEntry, String hourEntry) {
        this.dateEntry = dateEntry;
        this.hourEntry = hourEntry;
    }
    
    public Entry(){
        
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
