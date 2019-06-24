
package model.bo;

public class LegalPerson extends Person {       //Corporations/Organizations e.g. McDonalds
    public int numberCnpj;          //CNPJ is used for a Legal Person's ID in Brazil
    public int inscEstadual;        //state registration / state tax number

    
    
    public LegalPerson(int numberCnpj, int inscEstadual, String name, String email, String adress, int phone) {
        super(name, email, adress, phone);
        this.numberCnpj = numberCnpj;
        this.inscEstadual = inscEstadual;
    }
    
    public LegalPerson() {
        
    }

    
    public int getNumberCnpj() {
        return numberCnpj;
    }

    public void setNumberCnpj(int numberCnpj) {
        this.numberCnpj = numberCnpj;
    }

    public int getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(int inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    
    @Override
    public String toString() {
        return "LegalPerson{" + "numberCnpj=" + numberCnpj +
                ", inscEstadual=" + inscEstadual + super.toString() + '}';
    }
}
