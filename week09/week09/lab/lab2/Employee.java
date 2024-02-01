package week09.lab.lab2;

public abstract class Employee extends Person implements IncomeTax{
    private String position; 
    private double salary;

    public Employee(String name, String gender, int age, String position, double salary){
        super(name, gender, age);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition() {
        return position; 
    }
    public void setPosition(String position) {
        this.position = position; 
    }
    public double getSalary() {
        return salary; 
    }
    public void setSalary(double salary) {
        this.salary = salary; 
    }

    public void getDetails() {
        System.out.println(super.getName() + " is currently working as a/an " + getClass().getSimpleName() +"."); 
    }

    public double calculateTaxableIncome(){
        return (salary*12);
    }

    public double calculateTax(){
        double tex = 0.0;
        if(calculateTaxableIncome() > 0 && calculateTaxableIncome() <= 150000){
            tex = calculateTaxableIncome();
        }else if(calculateTaxableIncome() <= 300000){
            tex = (calculateTaxableIncome()*0.05) ;
        }else if(calculateTaxableIncome() <= 500000){
            tex = (calculateTaxableIncome()*0.1) ;
        }else if(calculateTaxableIncome() <= 750000){
            tex = (calculateTaxableIncome()*0.15) ;
        }else if(calculateTaxableIncome() <= 1000000){
            tex = (calculateTaxableIncome()*0.2) ;
        }else if(calculateTaxableIncome() <= 2000000){
            tex = (calculateTaxableIncome()*0.25) ;
        }else if(calculateTaxableIncome() <= 5000000){
            tex = (calculateTaxableIncome()*0.30) ;
        }else if(calculateTaxableIncome() > 5000000){
            tex = (calculateTaxableIncome()*0.35) ;
        }
        return tex;
    }
}