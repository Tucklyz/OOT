package week08.lab.lab1;

public class Animal{
    private String name;
    private String gender;
    private int age;
    private String colour;
    private String food;

    public Animal(){
        System.out.println("A new " + getClass().getSimpleName() + " object is created.");
    }

    public Animal(String name, String gender, int age, String colour){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.colour = colour;
        System.out.println("A " + this.age + "-year-old " + this.colour + " " + this.gender + " " + getClass().getSimpleName() + " object named \"" + this.name + "\" is created.");
    }

    public void makeNoise(){
        System.out.println(this.name + " is making noise.");
    }

    public void eat(String food){
        this.food = food;
        System.out.println(this.name + " is eating " + this.food + ".");
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getColour() {
        return colour;
    }
    public String getFood() {
        return food;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setFood(String food) {
        this.food = food;
    }
}
