package lab602.ex2 ;

public class Vehicle{
    private String brand ;
    private String colour ;
    private int year ;
    private String model ;

    public Vehicle(String brand, String colour, int year, String model) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }
    public String getColour() {
        return colour;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void printDetials(){
        System.out.println("vehicle: " + getClass().getSimpleName());
        System.out.println("Manufacturer: " + this.brand);
        System.out.println("Colour: " + this.colour);
        System.out.println("Year: " + this.year);
        System.out.println("Model: " + this.model);
       
    }

}