package object.oriented.programming;

/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class SwapViaDoubleClass {

    public static void main(String args[]){
   TT t1=new TT();
   System.out.println(t1.i);
   System.out.println(t1.j);
   TT t2=new TT();
   System.out.println(t2.j);
   System.out.println(t2.j);
   System.out.println("t1 of i is :"+t1.i+" t1 of j is : "+t1.j);
   System.out.println("t2 of i is :"+t2.i+" t2 of j is : "+t2.j);
}
}
class TT{
static int i=0;
int j=3;
TT(){
i++;
j++;
}
}
