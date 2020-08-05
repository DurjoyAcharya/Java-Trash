package arrays;
/**
 *
 * @author User
 */
public class Indipendented {
    public static void main(String...r){
    int a=20;
    int b=30;
    System.out.println("Before swap "+a+" "+b);
    ma(a,b);
    }
    public static void ma(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After Swap "+x+" "+y);
    }
}
