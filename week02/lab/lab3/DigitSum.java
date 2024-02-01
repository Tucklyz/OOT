package week02.lab.lab3;
import java.util.Scanner;
public class DigitSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a five-digit integer: ");
        int num = sc.nextInt();
        int x1, x2, x3, x4, x5, sum ;
        x1 =  (int)(num/1e4)%10;
        x2 =  (int)(num/1e3)%10;
        x3 = (int)(num/1e2)%10;
        x4 = (int)(num/1e1)%10;
        x5 = (int)num%10;
        sum = x1 + x2 + x3 + x4 + x5 ;
        System.out.println("The sum of all digits in " + num +" is " + sum+ ".");
        sc.close();
    }
}