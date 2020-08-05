package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Scanner;
public class Colums {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[][] matrix=new int [3][3];
     System.out.println("Enter "+matrix.length+" row and "+matrix[0].length+" Colums");
             for (int row = 0; row <matrix.length ; row++) {
                for (int colums = 0; colums <matrix[row].length ; colums++) {
                        matrix[row][colums] = sc.nextInt();
    }
        }
             for (int column = 0; column < matrix[0].length; column++) {
                int total1 = 0;
            for (int row = 0; row < matrix.length; row++)
                    total1 += matrix[row][column];
            System.out.println("Sum for column " + column + " is " + total1);
    }
             
    }
}

