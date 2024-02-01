package week04.lab.lab2;
import java.util.Scanner;
public class MatrixTransposing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        int[][] initialMatrix = new int[row][column] ;
        int[][] transposed_Matrix = new int[column][row] ;
        System.out.print("Enter the matrix values: ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                initialMatrix[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("The initial matrix:  ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(initialMatrix[i][j]+"\t");
            }
            System.out.println("");
        }for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                transposed_Matrix[j][i] = initialMatrix[i][j];
            }
        }
        System.out.println("The transposed matrix: ");
        for(int i = 0 ; i < column ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(transposed_Matrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}