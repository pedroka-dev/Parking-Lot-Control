
package model.bo;

public class Entry {
    private int id;
    private String dateEntry;
    private String hourEntry;

    
    public Entry(int id, String dateEntry, String hourEntry) {
        this.id = id;
        this.dateEntry = dateEntry;
        this.hourEntry = hourEntry;
    }

    public Entry(){
        
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
