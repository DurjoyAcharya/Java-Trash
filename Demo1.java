package arrays;
/**
 *
 * @author User
 */
public class Demo1 {
    public static void main(String...r){
       int[] list = {1, 2, 3, 4, 5};
       for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
       reverse(list);
       for (int i = 0; i < list.length; i++)
            System.out.println(list[i] + " ");
       
       for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
}
       public static void reverse(int[] list) {
       int[] newList = new int[6];
       for (int i = 0; i < list.length; i++){
           newList[i] = list[list.length - 1 - i];
           list[i]=newList[i];
    }
 }
}

