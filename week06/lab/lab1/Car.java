package week06.lab.lab1;

public class Car {
    private String brand;
    private String model;
    private String year;

    public Car(){

    }
    
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    
    public Car(String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setBrand(String brand){
        this.brand = brand ;
    }

    public void setModel(String model){
        this.model = model ;
    }

    public void setYear(String year){
        this.year = year ;
    }
    
    public String getBrand(String brand){
        return brand;
    }

    public String getModel(String model){
        return model;
    }

    public String getYear(String year){
        return  year;
    }

    public void displayInfo(){
        System.out.printf("%-17s%-25s%6s\n", brand, model, year);
    }
}