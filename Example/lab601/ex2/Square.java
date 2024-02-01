package lab601.ex2 ;

public class Square extends Geometry{

    public Square(int length){
        super(length);
    }
    
    public void calculatePerimeter(int length){    
        super.setPerimeter(length*4) ; 
    }

    public void calculateArea(int length){
        super.setArea(Math.pow(length, 2));
    }

    public void getGeoType(){
        System.out.println("This is a Square");
    }
}
