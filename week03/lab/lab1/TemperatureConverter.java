package week03.lab.lab1;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.print("Please enter a tempature value in the Celsius scale : ");
        Scanner sc = new Scanner(System.in);
        double Celsius = sc.nextDouble();
        double convertedTemp;
        System.out.print("Pleare enter a tempature scale for conversion (K/F/R): ");
        char tempscale = sc.next().charAt(0);
        sc.close();
        if(tempscale == 'K' || tempscale == 'k' ){
            convertedTemp = (Celsius + 273.15);
            System.out.println("Kelvin: " + convertedTemp);
        }
        else if (tempscale == 'F'|| tempscale == 'f'){
            convertedTemp = ((1.8)*Celsius) + 32;
            System.out.println("Fahtanheit: " + convertedTemp);
        }
        else if(tempscale == 'R'|| tempscale == 'r'){
            convertedTemp = ((Celsius+273.15)*(1.8));
            System.out.println("Rankine: " + convertedTemp);
        }
        else{
            System.out.println("Invalid tempature scale!");
        }
    }
}