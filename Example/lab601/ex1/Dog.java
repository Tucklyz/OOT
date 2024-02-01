package lab601.ex1;

public class Dog extends Animal {
    public Dog() {
        System.out.println("New Dog object is created.");
    }
    
    public Dog(String name, String colour) {
        super(name,colour);
        System.out.println(super.getName() + " is a " + super.getColour()+ " dog.");
    }

    public void makeNoise() {
        System.out.println("Dog is barking.");
    }
}