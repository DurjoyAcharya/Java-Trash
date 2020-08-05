package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class array_testing {
public static void main(String[] args){
    java.util.Scanner in=new java.util.Scanner(System.in);
    System.out.println("Enter row size");
    int row=in.nextInt();
    System.out.println("Enter colums size");
    int colums=in.nextInt();
    System.out.println("Ente values for "+row+" * "+colums+" array");
    int[][] arr=new int[row][colums];
    for(int i=0;i<row;i++){
        for(int j=0;j<colums;j++){
            arr[i][j]=in.nextInt();
        }
    }
    System.out.println("The Given array");
    for(int i=0;i<row;i++){
        for(int j=0;j<colums;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }    
    }
}
