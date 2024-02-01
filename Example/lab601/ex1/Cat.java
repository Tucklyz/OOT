package lab601.ex1;

public class Cat extends Animal {
    private String breed = "";
    public Cat() {
        System.out.println("New Cat object is created.");
    }

    public Cat(String name, String colour, String breed) {
        super(name,colour);
        this.breed = breed;
        System.out.println(super.getName() + " is a " + super.getColour()+ " " + this.breed + " cat.");
    }

    public void makeNoise() {
        System.out.println("Cat is meowing.");
    }
}