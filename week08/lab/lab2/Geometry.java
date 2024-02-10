    package week08.lab.lab2;

public class Geometry{
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

    public double calculatePerimeter(){
        if(getClass().getSimpleName().equals("Triangle")){
            this.perimeter = 3 * this.length ;
        }else if(getClass().getSimpleName().equals("Square")){
            this.perimeter = 4 * this.length ;
        }else if(getClass().getSimpleName().equals("Circle")){
            this.perimeter = 2 * Math.PI * this.length ;
        }
        return this.perimeter ;
    }

    public double calculateArea(){
        if(getClass().getSimpleName().equals("Triangle")){
            this.area = Math.sqrt(3) / 4 * Math.pow(this.length, 2) ;
        }else if(getClass().getSimpleName().equals("Square")){
            this.area = Math.pow(this.length, 2) ; 
        }else if(getClass().getSimpleName().equals("Circle")){
            this.area = Math.PI * Math.pow(this.length, 2) ;
        }
        return this.area ;
    }

    public void getGeoType(){
        System.out.println("This is a " + getClass().getSimpleName());
    }
}