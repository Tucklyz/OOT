package week08.lab.lab2;

import java.text.DecimalFormat;

public class MainClass{
    public static void main(String[] args){
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Triangle(4);
        geometries[1] = new Square(5);
        geometries[2] = new Circle(6);
        printDetails(geometries);
    }

    public static void printDetails(Geometry[] geometries){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for(int i = 0 ; i < 3 ; i++){
            geometries[i].calculatePerimeter();
            geometries[i].calculateArea();
            geometries[i].getGeoType();
            System.out.println("Length: " + decimalFormat.format(geometries[i].getLength()));
            System.out.println("Perimeter: " + decimalFormat.format(geometries[i].getPerimeter()));
            System.out.println("Area: " + decimalFormat.format(geometries[i].getArea()));
            System.out.println();
        }
    }
}