package week11.lab.lab2;

import java.util.Scanner;
public class MainClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator("Casio AX-120ST");
        System.out.println(calc.getName());
        System.out.print("Enter an equation: ");
        String str = sc.nextLine();
        String[] parts = str.split(" ");
        int size = parts.length;
        try{
            if(size % 2 == 0) throw new EquationException("Incomplete equation");
            for(int i = 0; i < size; i += 2)
                for (int j = 0; j < parts[i].length(); j++) 
                    if (Character.isLetter(parts[i].charAt(j)))  
                        throw new NonDigitException(parts[i].trim() + " contains non-digit characters");
            double result = Double.parseDouble(parts[0].trim());
            for (int i = 1; i < size; i += 2) {
                double operand = Double.parseDouble(parts[i + 1].trim());
                switch (parts[i]) {
                    case "+":
                        result = calc.add(result, operand);
                        break;
                    case "-":
                        result = calc.subtract(result, operand);
                        break;
                    case "*":
                        result = calc.multiply(result, operand);
                        break;
                    case "/":
                        result = calc.divide(result, operand);
                        break;
                    default:
                        throw new OperatorException(calc.getName() + " dose not have the " + parts[i] + " operator");
                }
            }
            for (int i = 0; i < size; i++) 
                System.out.print(parts[i] + " ");
            System.out.println("= " + result);
        }
        catch (NonDigitException | OperatorException | EquationException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        catch(ArithmeticException ex){
            System.out.println("An exception occurred: " + ex);
            System.out.println("Divistion by zero");
            System.exit(1);
        }
    }
}