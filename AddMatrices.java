package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Hi gays this matrics sum enter the number(2-6) of matrics you wanna sum: ");
    int n=sc.nextInt();
    System.out.print("Enter the size of rows and colums : ");
    byte row =sc.nextByte();
    byte colums=sc.nextByte();
    int[][] first=new int[row][colums];
    int[][] second=new int[row][colums];
    int[][] third=new int[row][colums];
    int[][] forth=new int[row][colums];
    int[][] fifth=new int[row][colums];
    int[][] sixth=new int[row][colums];
    if(n==2){
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
            sum[i][j]=first[i][j]+second[i][j];
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
    }else if(n==3){
    
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
    System.out.print("Enter the third Matrics: ");
    for(int i=0;i<third.length;i++){
        for(int j=0;j<third[i].length;j++){
            third[i][j]=sc.nextInt();
            }
    }
    int[][]sum=new int[row][colums];
    for(int i=0;i<row;i++){
        for(int j=0;j<colums;j++){
            sum[i][j]=first[i][j]+second[i][j]+third[i][j];
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
    }else if(n==4){
    
    
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
    System.out.print("Enter the third Matrics: ");
    for(int i=0;i<third.length;i++){
        for(int j=0;j<third[i].length;j++){
            third[i][j]=sc.nextInt();
            }
    }
    System.out.print("Enter the forth Matrics: ");
    for(int i=0;i<forth.length;i++){
        for(int j=0;j<forth[i].length;j++){
            forth[i][j]=sc.nextInt();
            }
    }
    int[][]sum=new int[row][colums];
    for(int i=0;i<row;i++){
        for(int j=0;j<colums;j++){
            sum[i][j]=first[i][j]+second[i][j]+third[i][j]+forth[i][j];
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
    
    }else if(n==5){
    
    
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
    System.out.print("Enter the third Matrics: ");
    for(int i=0;i<third.length;i++){
        for(int j=0;j<third[i].length;j++){
            third[i][j]=sc.nextInt();
            }
    }
    System.out.print("Enter the forth Matrics: ");
    for(int i=0;i<forth.length;i++){
        for(int j=0;j<forth[i].length;j++){
            forth[i][j]=sc.nextInt();
            }
    }
    System.out.print("Enter the fifth Matrics: ");
    for(int i=0;i<fifth.length;i++){
        for(int j=0;j<fifth[i].length;j++){
            fifth[i][j]=sc.nextInt();
            }
    }
    int[][]sum=new int[row][colums];
    for(int i=0;i<row;i++){
        for(int j=0;j<colums;j++){
            sum[i][j]=first[i][j]+second[i][j]+third[i][j]+forth[i][j]+fifth[i][j];
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
    }else{
    System.out.println("Sorry Bro! You are take mistake try again");
    System.out.print("__________________________________________");
    }
}
}