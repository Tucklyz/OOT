package lab601.ex2 ;

public class Triangle extends Geometry{

    public Triangle(int length){
        super(length);
    }

    public void calculatePerimeter(int length){    
        super.setPerimeter(length*3) ; 
    }

    public void calculateArea(int length){
        super.setArea((Math.sqrt(3)/4)*Math.pow(length,2));
    }

    public void getGeoType(){
        System.out.println("This is a Triangle");
    }
}
