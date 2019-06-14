
package model.bo;

public class NaturalPerson extends Person {     //Real person (e.g. John)
    private int numberCpf;
    private int numberRg;
    //CPF and RG is used for a Natural Person's ID in Brazil
    
    public NaturalPerson(int numberCpf, int numberRg, String name, String email, String adress, int phone) {
        super(name, email, adress, phone);
        this.numberCpf = numberCpf;
        this.numberRg = numberRg;
    }

    public NaturalPerson(){
        
    }
    
    
    public int getNumberCpf() {
        return numberCpf;
    }

    public void setNumberCpf(int numberCpf) {
        this.numberCpf = numberCpf;
    }

    public int getNumberRg() {
        return numberRg;
    }

    public void setNumberRg(int numberRg) {
        this.numberRg = numberRg;
    }

    
    @Override
    public String toString() {
        return "NaturalPerson{" + "numberCpf=" + numberCpf + 
                ", numberRg=" + numberRg + super.toString() + '}';
    }
}
