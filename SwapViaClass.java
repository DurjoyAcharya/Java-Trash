package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class SwapViaClass {
    public static void main(String args[]){
    T t=new T();
    Swap(t);
    int a=25,b=30;
    System.out.println("t.e1 is "+t.e1+" And "+" t.e2 is "+t.e2);
    }
    public static void Swap(T t){
    int temp=t.e1;
    t.e1=t.e2;
    t.e2=temp; 
    }
}
class T{
int e1=1;
int e2=2;
}
