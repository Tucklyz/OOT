package lecture5.ex3 ;

public class Circle{
    private double radius = 1.0;
    private double area;
    public Circle() {
        calculateArea();
    }

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return area;
    }
    private void calculateArea() {
        this.area = Math.PI * Math.pow(radius, 2);
    }
}
