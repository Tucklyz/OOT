package lab602.ex2 ;

public class Aeroplane extends Vehicle{
    private String propulsion ;

    public String getPropulsion() {
        return propulsion;
    }
    public void setpropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public Aeroplane(String brand, String colour, int year, String model, String propulsion){
        super(brand, colour, year, model);
        this.propulsion = propulsion ;
    }

    public void printDetials(){
        super.printDetials();
        System.out.println("Propulsion: " + this.propulsion);
       
    }
}