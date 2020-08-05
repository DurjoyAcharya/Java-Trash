package arrays;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Arrays {

    /**
     * @param args the command line arguments
     */
    static double total;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int list[]={25,5,85,5,8,5,8,75,7,44,7,741,747,4,7,4,78,654,8986,56887,2121,65745};
       double[] k=new double[10];
       System.out.println("Enter value "+k.length+" numbers");
       for(int j=0;j<k.length;j++){
           k[j]=Math.random()*100;
       }
       for(int j=0;j<k.length;j++)
           total+=k[j];
       System.out.println(total);
    }
    
}
