package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class TestCount {
public static void main(String args[]){
Count mycount=new Count();
int times=0;
for(int i=0;i<100;i++){
increment(mycount,times);
System.out.println(mycount.count);
}
public static void increment(Count c,int times){
c.count++;
times++;
}
}

