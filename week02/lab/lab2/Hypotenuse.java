package week02.lab.lab2;
import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = sc.nextDouble();
        System.out.print("Enter b : ");
        double b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse c is " + c);
        sc.close();
    }
}