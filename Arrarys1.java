package arrays;
public class Arrarys1 {
    public static void main(String...a){
        int[] list={11,25,246,15,25,2564,10,14};
        int max=list[0];
        int indexofmax = 0;
        for(int i=0;i<list.length;i++){
            if(list[i]<max){
                max=list[i];
             indexofmax=i;
            }
        }
       for(int e: list){
       System.out.println(e);
       }
       System.out.println("Index of max Element: "+indexofmax);
       System.out.println(max);
       System.out.println(list.length);
    }
}