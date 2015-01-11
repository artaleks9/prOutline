package com.codenvy.qa;

public class EmployeeFixedSalary extends Empl {

    private   double fixedPayment;
    protected long   longVar;
    public    int    intVar;
    private   byte   byteVar;
    protected short  shortVar;
    public    char   charVar;
    float            floatVar ;
    boolean          boolVar;



    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public double getAvrSalary(){
        return fixedPayment;
    }

    public String toString(){
        return "\nEmployee with fixed salary\n"+getEmployeeNumber()
                +"\n"+getSurname()+"\n"+getDateOfBirth()+"\n"+getFixedPayment()
                +"\n"+getAvrSalary()+"\n";
    }
}
