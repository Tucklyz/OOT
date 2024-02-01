package lab602.ex2 ;

public class ElectricCar extends Car{
    private int battery;
    //private Car car;

    public ElectricCar(String brand, String colour, int year, String model, String bodyStyle, int battery) {
        //super(brand, colour, year, model);
        //this.car = new Car(brand, colour, year, model, bodyStyle);
        super(brand, colour, year, model, bodyStyle);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }
    public void setbattery(int battery) {
        this.battery = battery;
    }
    
    public void printDetials(){
        super.printDetials();
        //System.out.println("Body Style: " + this.car.getBodyStyle());
        System.out.println("Battery Capacity: " + this.battery + " kWh");
       
    }
}