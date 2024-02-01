package lab601.ex2 ;

public class Circle extends Geometry{

    public Circle(int length){
        super(length);
    }
    
    public void calculatePerimeter(int length){    
        super.setPerimeter(2 * Math.PI * length) ; 
    }

    public void calculateArea(int length){
        super.setArea(Math.PI * Math.pow(length,2));
    }

    public void getGeoType(){
        System.out.println("This is a Circle");
    }
}
