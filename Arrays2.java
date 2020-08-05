package arrays;
public class Arrays2 {
    public static void main(String...r){
    int[] mylist={9,7,5,3,1,11,13,15,17,19};
    int[] nlist;
    for(int i=mylist.length-1;i>0;i--){
        int j=(int)(Math.random()*i+1);
        int temp=mylist[i];
        mylist[i]=mylist[j];
        mylist[j]=temp;
    }
    for(int j=0;j<mylist.length;j++){
    System.out.println(mylist[j]);
    }
    }
}
