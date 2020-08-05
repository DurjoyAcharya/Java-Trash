package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class SwapViaArray {
    public static void main(String args[]){
    int[] arr={1,2};
    Swap(arr);
    System.out.println("Hare arr[0] is "+arr[0]+" And "+" arr[1] is "+arr[1]);
    }
    public static void Swap(int[]a){
    int temp=a[0];
    a[0]=a[1];
    a[1]=temp;
    }
}
