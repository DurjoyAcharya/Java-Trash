package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Scanner;
public class TestSimpleCircle {
   public static void main(String args[]){
   int [][] m=getarray();
   System.out.println("\n Sum of all element in the array "+sum(m));
   
   }
   public static int[][] getarray(){
       Scanner sc=new Scanner(System.in);
       int x,y;
       System.out.println("Enter the of array first enter row and then colums");
       x=sc.nextInt();
       y=sc.nextInt();
       int[][] m=new int[x][y];
       System.out.println("Enter "+m.length+" rows and "+ m[0].length+" Colums");
       for(int i=0;i<m.length;i++){
           for(int j=0;j<m[i].length;j++)
               m[i][j]=sc.nextInt();
       }
       
       return m;
   }
   public static int sum(int[][] m){
   int total=1;
   for(int row=0;row<m.length;row++){
       for(int colums=0;colums<m[row].length;colums++){
           total*=m[row][colums];
       }
   }
   return total;
   }
}
