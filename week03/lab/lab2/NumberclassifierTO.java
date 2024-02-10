package week03.lap.lap2;
import java.util.Scanner;
public class NumberclassifierTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        double number = sc.nextDouble();
        sc.close();
        double n01 = (number * 100)%100;
        int n02 = (int) number;
        System.out.print(number + " is the ");
        String check1 = ((number != 0) ? ((number > 0) ? "positive " : "negative ") : "");
        String check2 = ((n02%2 == 0) ? "even " : "odd " );
        String check3 = ((n01 != 0) ? "real number." : "integer number ");
        System.out.print(check1  + check2 + check3);
    }
}