package arrays;
/**
 *
 * @author User
 */
public class Trail {
    public static void main(String...r){
    int x = 2; // x represents an int value
    int[] y = new int[10];// y represents an array of int values
    int[] z = {25,25,20};
    m(x, y, z); // Invoke m with arguments x and y
    System.out.println("x is " + x);
    System.out.println("y[0] is " + y[0]);
    System.out.println("z[0] is " + z[0]);
    System.out.println("y[1] is " + y[1]);
    System.out.println(y[0]+z[0]);
}
    public static void m(int number, int[] numbers,int[] songkha) {
    number = 1001; // Assign a new value to number
    numbers[0] = 5555;
    songkha[0] = 2005;
    System.out.println("The xtra number is "+number);
    System.out.println(numbers[0]+songkha[0]+number);
    }
}