/*
    Subject : Object Oritented Technology
    Teacher : Mr. Komsan Srivisut
    Student Id : B6515652
    Programmer : Nadthapat Phuttaruksa
    No : 23
*/

// Week05 : Methods and Overloading
// Lab2 : ExpenseTracker
package week05.lab.lab2;
import java.util.Scanner;
public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalIncome = 0, totalExpense = 0;
        float amount = 1000;
        boolean check = true ;
        do{
            System.out.println("===== Expense Tracker =====");
            System.out.printf("Current amount: %.2f\n",amount);
            System.out.println("+ : Income");
            System.out.println("- : Expense");
            System.out.println("x : Termination");
            System.out.print("Please enter your choice: ");
            char choice = sc.next().charAt(0);
            if(choice == '+' ){
                System.out.print("Enter an income amount: ");
                float income = sc.nextFloat();
                totalIncome += income ;
                amount = addIncome(amount,income);
            }else if(choice == '-' ){
                System.out.print("Enter an expense amount: ");
                float expense = sc.nextFloat();
                if(expense <= amount){
                    totalExpense += expense ;
                    amount = addExpense(amount,expense);
                }else{
                    System.out.println("Invalid amount! Please try again.");
                }
            }else if(choice == 'x' ){
                check = false ;
                System.out.println("Existing...");
            
            }else{
                System.out.println("Invalid choice! Please try again.");
            }
            System.out.println("");
        }while(check);
        printSummary(totalIncome,totalExpense,amount);
    }

    public static float addIncome(float a,float i) {
        return (a + i);
    }

    public static float addExpense(float a,float e){
        return (a - e);
       
    }

    public static void printSummary(float income ,float expense ,float tAmount){
       System.out.println("===== Summary =====");
            System.out.printf("Total Income: %.2f\n",income);
            System.out.printf("Total Expense: %.2f\n",expense);
            System.out.printf("Total Amount: %.2f\n", tAmount);
    }
}