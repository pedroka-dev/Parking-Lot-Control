
package model.bo;

public abstract class Person {       //super of LegalPerson and Natural Person
    private String name;
    private String email;
    private String adress;
    private int phone;

    
    public Person(String name, String email, String adress, int phone) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
    }
    
    public Person() {
        
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

    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", email=" + email + ", adress=" + adress + ", phone=" + phone + '}';
    }
}
