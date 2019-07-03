
package model.bo;

public class Person {      //Registered owner of a vehicle
    private int id;
    private String name;
    private String email;
    private String adress;
    private String numberRg;
    private String numberCnh;
    private int numberCpf;
    private int phone;

    
    public Person(int id, String name, String email, String adress, String numberRg, String numberCnh, int numberCpf, int phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.numberRg = numberRg;
        this.numberCnh = numberCnh;
        this.numberCpf = numberCpf;
        this.phone = phone;
    }

    public Person() {
        
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getNumberRg() {
        return numberRg;
    }

    public void setNumberRg(String numberRg) {
        this.numberRg = numberRg;
    }

    public String getNumberCnh() {
        return numberCnh;
    }

    public void setNumberCnh(String numberCnh) {
        this.numberCnh = numberCnh;
    }

    public int getNumberCpf() {
        return numberCpf;
    }

    public void setNumberCpf(int numberCpf) {
        this.numberCpf = numberCpf;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", email=" + email + 
                ", adress=" + adress + ", numberRg=" + numberRg + 
                ", numberCnh=" + numberCnh + ", numberCpf=" + numberCpf + 
                ", phone=" + phone + '}';
    }  
}
