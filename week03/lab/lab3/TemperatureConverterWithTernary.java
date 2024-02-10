package week03.lap.lap3;

import java.util.Scanner;

public class TemperatureConverterWithTernary {
    public static void main(String [] agrs){
        System.out.print("Please enter a temperature value in the Celsius scale: ");
        Scanner sc=new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.print("Please enter a temperature scale for conversion (K/F/R): ");
        char tempScale = sc.next().charAt(0);
        sc.close();
        double kelvin = celsius + 273.15, 
                fahrenheit = celsius * 9/5 + 32, 
                rankine = (celsius + 273.15)*9/5;
        String result = (tempScale =='K' || tempScale=='k') ? "Kelvin: "+kelvin
                    : (tempScale =='F' || tempScale=='f') ? "Fahrenheit: "+fahrenheit
                    : (tempScale == 'R' || tempScale == 'r') ? "Rankine: "+rankine
                    :"Invalid temperature scale!";
        System.out.println(result);
    }   
}
