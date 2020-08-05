package arrays;

/**
 *
 * @author tourist
 */
public class Binary_Approch {
    public static void main(String args[]){
        int[] list={2,4,7,10,11,45,50,59,60,66,69,79,80};
        int key=5;
        int i = Binary_search(list, 4);
        int j = Binary_search(list, 11); // Returns 4
        int k = Binary_search(list, 12); // Returns –6
        int l = Binary_search(list, 1); // Returns –1
        int m = Binary_search(list, 3); // Returns –2
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
            System.out.println(l);
            System.out.println(m);
       }   
    public static int Binary_search(int list[],int key){
        int low=0;
        int high=list.length-1;
        while(high>=low){
            int mid = (low + high) / 2;
            if(key<list[mid])
                high=mid-1;
            else if(key==list[mid])
                return mid;
            else
                low=mid+1;
        }
        return -low-1;
    }
}