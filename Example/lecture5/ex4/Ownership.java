package lecture5.ex4 ;
public class Ownership{
    private Owner owner;
    private Car car;

    public Ownership(Owner owner, Car car){
        this.owner = owner;
        this.car = car;
    }

    public String toString(){
        return (owner.getName() + "\t" + owner.getGender() + "\t" + owner.getAge() + "\n" +
        car.getLicenseID() + "\t" + car.getBrand() + "\t" + car.getColour());
    }
}