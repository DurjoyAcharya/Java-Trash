package Algorithoms;

/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Scanner;
public class SubstractionTwoMatrics {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of rows and colums : ");
    byte row =sc.nextByte();
    byte colums=sc.nextByte();
    int[][] first=new int[row][colums];
    int[][] second=new int[row][colums];
    System.out.print("Enter the first Matrics: ");
    for(int i=0;i<first.length;i++){
        for(int j=0;j<first[i].length;j++){
            first[i][j]=sc.nextInt();
        }
    }
    System.out.print("Enter the second Matrics: ");
    for(int i=0;i<second.length;i++){
        for(int j=0;j<second[i].length;j++){
            second[i][j]=sc.nextInt();
            }
    }   
    int[][]sum=new int[row][colums];
    for(int i=0;i<row;i++){
        for(int j=0;j<colums;j++){
            sum[i][j]=first[i][j]-second[i][j];
        }
    }
    System.out.println("\tThe Sum of the given matrics :");
    System.out.println("\t----------------------------");
    for(int i=0;i<row;i++){
        for(int j=0;j<colums;j++){
            System.out.print("\t"+sum[i][j]);
            System.out.print("");
        }
        System.out.println();
    }
}
}
