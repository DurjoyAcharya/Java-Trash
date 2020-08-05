package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class print {
    public static void main(String[] args){
    int[][] arr={{1,2},{3,4},{5,6}};
    for(int i=arr.length-1;i>=0;i--){
        for(int j=arr[i].length-1;j>=0;j--){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    int[][] array={{1,2,2},
                   {3,4,1},
                   {5,6,2}};
    int sum=0;
    for(int i=0;i<array.length;i++){
       sum+=array[i][0];
    }
    System.out.println(sum);
    }
}
