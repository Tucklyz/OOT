package week03.lap.lap3;

import java.util.Scanner;

public class TemperatureConverterWithSwitch {
    public static void main(String [] args){
        System.out.print("Please enter a temperature value in the Celsius scale: ");
        Scanner sc=new Scanner(System.in);
        double celsius = sc.nextDouble();
        double convertedTemp;
        System.out.print("Please enter a temperature scale for conversion (K/F/R): ");
        char tempScale = sc.next().charAt(0);
        sc.close();
        switch (tempScale) {
            case 'K':
            case 'k':
                convertedTemp = celsius + 273.15;
                System.out.println("Kelvin: " + convertedTemp);
                break;
            case 'F':
            case 'f':
                convertedTemp = celsius * 9/5 + 32;
                System.out.println("Fahrenheit: " + convertedTemp);
                break;  
            case 'R':
            case 'r':
                convertedTemp = (celsius + 273.15)*9/5;
                System.out.println("Rankine: " + convertedTemp);
                break;

            default:
                System.out.println("Invalid temperature scale!");
                break;
        }
    }
}
