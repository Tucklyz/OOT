package lecture5.ex4 ;
public class Exercise54{
    public static void main(String[] args){
        Owner o1 = new Owner("Peter", "Male", 24);
        Car c1 = new Car(464353, "BMW", "black");
        Ownership os1 = new Ownership(o1, c1);
        System.out.println(os1);
    }
}

