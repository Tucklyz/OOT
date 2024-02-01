package lab601.ex2 ;

public class MainClass{
    public static void main(String[] args){
        Geometry[] geometries = new Geometry[3] ;
        geometries[0] = new Triangle(4);
        printDetail(geometries[0]);
        System.out.println();
        
        geometries[1] = new Square(5);
        printDetail(geometries[1]);
        System.out.println();

        geometries[2] = new Circle(6);
        printDetail(geometries[2]);
        System.out.println();

    }

    public static void printDetail(Geometry geometries){
        geometries.calculatePerimeter(geometries.getLength());
        geometries.calculateArea(geometries.getLength());
        geometries.getGeoType();
        System.out.println("Length: " + geometries.getLength());
        System.out.println("Perimeter: " + geometries.getPerimeter());
        System.out.println("Area: " + geometries.getArea());
    }
}
