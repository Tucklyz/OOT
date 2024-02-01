package lab863.ex2;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input form Keyboard: ");
        String str = scanner.nextLine();
        scanner.close();

        findLetter(str);
        findDigit(str);
    }

    public static void findLetter(String s){
        int numLetter = 0,index = 0,count = 1,check = 0;
        System.out.println("=== Letter ===");
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                numLetter++;
            }
        }
        char[] let = new char[numLetter];
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                let[index++] = s.toUpperCase().charAt(i);
            }
        }

        for(int i = 0; i < numLetter; i++){
            for(int j = i+1; j < numLetter; j++){
                if(let[i] > let[j]){
                    char key = let[i];
                    let[i] = let[j];
                    let[j] = key;
                }
            }
        }

        for(int i = 0; i < numLetter; i++){
            for(int j = i+1; j < numLetter; j++){
                if(let[i] == let[j]){
                    count++;
                }
            }
            for(int k = 0 ;k < i; k++){
                if(let[i] == let[k]){
                    check++;
                }
            }
            if(check == 0){
                System.out.println(let[i] + " = " + count);
            }
            check = 0;
            count = 1;
        }
        System.out.println("");
    }

    public static void findDigit(String s){
        int numDigit = 0,index = 0,count = 1, check = 0, max, min;
        System.out.println("=== Digit ===");
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                numDigit++;
            }
        }
        char[] dig = new char[numDigit];
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                dig[index++] = s.toUpperCase().charAt(i);
            }
        }

        for(int i = 0; i < numDigit; i++){
            for(int j = i+1; j < numDigit; j++){
                if(dig[i] > dig[j]){
                    char key = dig[i];
                    dig[i] = dig[j];
                    dig[j] = key;
                }
            }
        }
        max = dig[numDigit-1]-'0';
        min = dig[0]-'0';
        for(int i = 0; i < numDigit; i++){
            for(int j = i+1; j < numDigit; j++){
                if(dig[i] == dig[j]){
                    count++;
                }
            }
            for(int k = 0 ;k < i; k++){
                if(dig[i] == dig[k]){
                    check++;
                }
            }
            if(check == 0){
                System.out.println(dig[i] + " = " + count);
            }
            check = 0;
            count = 1;
        }
        System.out.println("Max Digit is " + max);
        System.out.println("Min Digit is " + min);
        System.out.println("");
    }
}