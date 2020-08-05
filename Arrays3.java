package arrays;
public class Arrays3 {
public static void main(String...r){
int[] list={1,3,5,7,9,11,13,15,17,19};
int temp=list[0];
for(int i=1;i<list.length;i++){
    list[i-1]=list[i];
}
list[list.length-1]=temp;
for(int i=0;i<list.length;i++){
System.out.println(list[i]);
}
}    
}
