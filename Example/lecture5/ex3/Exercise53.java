package lecture5.ex3;

public class Exercise53{
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        System.out.println("Circle 1: area = " + c1.getArea() + ", raduis = " + c1.getRadius());
        System.out.println("Circle 1: area = " + c2.getArea() + ", raduis = " + c2.getRadius());

    }
}