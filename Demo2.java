package arrays;
/**
 *
 * @author User
 */
public class Demo2 {
    public static void main(String args[]){
        int[] a={1,2,3,4,5,6,7};
        int[] b=new int[7];
        for(int i=0;i<a.length;i++){
            b[i]=a[a.length-1-i];
            System.out.println(b[i]);
        }
    }
}