package Algorithoms;

/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class Test {
    public static void main(String args[]){
    int arr[][]={{1,2,3,4,5,120},{6,7,8,9,10,10},{1,2,3,2}};
    System.out.println(m1(arr)[0]);
    System.out.println(m1(arr)[1]);
    }
    public static int[] m1(int[][]m){
        int[] result=new int[2];
        result[0]=m.length;
        result[1]=m[0].length;
        return result;
    }
}
