package lab601.ex2 ;

public class Geometry {
    private int length ;
    private double perimeter ;
    private double area ;

    public Geometry(int length){
        this.length = length ;
    }

    public void setLength(int length){
        this.length = length ;
    }
    public int getLength(){
        return length ;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter ;
    }
    public double getPerimeter(){
        return perimeter ;
    }

    public void setArea(double area){
        this.area = area ;
    }
    public double getArea(){
        return area ;
    }

    public void calculatePerimeter(int length){    
    }

    public void calculateArea(int length){
    }

    public void getGeoType(){
    }
}
