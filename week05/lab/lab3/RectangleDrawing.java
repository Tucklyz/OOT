
/*
    Subject : Object Oritented Technology
    Teacher : Mr. Komsan Srivisut
    Student Id : B6515652
    Programmer : Nadthapat Phuttaruksa
    No : 23
*/

// Week05 : Methods and Overloading
// Lab3 : RectangleDrawing
package week05.lab.lab3;
public class  RectangleDrawing{
    public static void main(String[] args) {
        RectangleDrawing rd = new RectangleDrawing();
        rd.drawRectangle(5);
        System.out.println();
        rd.drawRectangle(6, 4);
        System.out.println();
        rd.drawRectangle(7, 3, '#');
        System.out.println();
        rd.drawRectangle(4, 6, '@');
    }

    public  void drawRectangle(int length) {
        System.out.println("A Square");
        for(int i = 0 ; i < length ; i++){
            for(int j = 0 ; j < length ; j++){
                if(i == 0 || j == 0 || i == length-1 || j == length-1){
                    System.out.print("0 ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    public  void drawRectangle(int length,int width){
        System.out.println("A Ractangle");
        for(int i = 0 ; i < width ; i++){
            for(int j = 0 ; j < length ; j++){
                System.out.print("X ");
            }System.out.println();
        }
    }

    public  void drawRectangle(int length,int width,char ch) {
        if(ch == '#'){
            System.out.println("A Parallelogram");
            for(int i = 0 ; i < width ; i++){
                for(int k = width-1-i ; k > 0 ; k--){
                    System.out.print("  ");
                }
                for(int j = 0 ; j < length ; j++){
                    System.out.print(ch + " ");
                }System.out.println();
            }
        }else{
            System.out.println("A Ractangle");
            for(int i = 0 ; i < width ; i++){
                for(int j = 0 ; j < length ; j++){
                    System.out.print("X ");
                }System.out.println();
            }
        }
    }
}