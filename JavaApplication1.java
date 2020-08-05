package Algorithoms;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter an integer:");
       while(!input.hasNextInt()){
            input.nextLine();
             System.out.println("Invalid!");
       }
       int i=input.nextInt();
       System.out.println(i);
    }
    
}
