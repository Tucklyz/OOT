package lab601.ex1;
public class MainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rocky", "black");
        dog1.makeNoise();
        System.out.println();
        Dog dog2 = new Dog();
        System.out.println();
        Cat cat1 = new Cat("Luna", "dark brown", "Siamese");
        cat1.makeNoise();
    }
}