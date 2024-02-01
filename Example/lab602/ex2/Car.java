package lab602.ex2 ;

public class Car extends Vehicle{
    private String bodyStyle;

    public String getBodyStyle() {
        return bodyStyle;
    }
    public void setbodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public Car(String brand, String colour, int year, String model, String bodyStyle){
        super(brand, colour, year, model);
        this.bodyStyle = bodyStyle ;
    }
    public void printDetials(){
        super.printDetials();
        System.out.println("Body Style: " + this.bodyStyle);
       
    }
}