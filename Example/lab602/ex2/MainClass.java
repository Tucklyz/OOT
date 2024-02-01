package lab602.ex2 ;

public class MainClass{
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("BMW", "Black", 2022, "Z4", "Roadster");
        vehicles[1] = new Aeroplane("Boeing", "White", 2012, "787", "Jet");
        vehicles[2] = new ElectricCar("Tesla", "Gray", 2021, "S", "Sedan", 100);

        for(Vehicle veh : vehicles){
            veh.printDetials();
            System.out.println();
        }
    }
}