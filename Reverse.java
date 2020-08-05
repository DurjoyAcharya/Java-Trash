package arrays;
/**
 *
 * @author User
 */
public class Reverse {
    public static void main(String...r){
    int[] a={1,2,3,4,5,6,7,8,9};
    int[] b=reverse(a);
    for(int i=0;i<a.length;i++){
        System.out.println(b[i]);
    }
}
 public static int[] reverse(int[] list) {
 int[] result = new int[list.length];

 for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
 result[j] = list[i];
}
return result;

}
}