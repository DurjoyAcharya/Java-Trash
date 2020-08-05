package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class printingarray {
    public static void main(String...r){
    int[][] arr={
        {1,2,3,4,5},
        {2,4,6,8,10},
        {1,3,5,7,9},
        {1,3,5,7,11}
    };
    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]);
        System.out.print("  ");
    }
    System.out.println();
    }
    }
}
