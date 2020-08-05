package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Intro {
    public static void main(String args[]){
        double[][] array=new double[2][2];
        int arr[][]={
        {1,2,3,4,5},
        {4,5,6,7,8},
        {3,2,1,4,6},
        {8,9,7,8,5}
    };
     arr[2][1]=256;
    array[0][0]=3.14159;
    System.out.println(arr[2][1]);
    System.out.println(array[0][0]);
    int a=cool();
    System.out.println(a+arr[3][0]);
    }
    public static int cool(){
        int answer=0;
        System.out.println("Enter the number of caes:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 2:
                if(a==2||a==3){
                answer=231;
                }
                else
                    answer=232;
             break;
            case 3:
                answer=4;
             break;
             case 7:
                answer=6;
             break;
             case 4:
                answer=8;
             break;
             case 5:
                answer=10;
             break;
             default:
                 answer=101;
    }
        
    return answer;
    }
}