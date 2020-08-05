package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class PrimitiveVsReferance {
    private static class Counter{
        private int count;
        public void advance(int number){
        count+=number;
        }
        public int getcount(){
        return count;
        }
    }
    public static void main(String args[]) {
            int i=30;
            System.out.println("Value of i before passing the mathod : ");
            print(30);
             System.out.println("Value of i after passing the mathod : ");
            Counter mycounter=new Counter();
    }
    public static void print(Counter ctr){
    ctr.advance(2);
    }
    public static void print(int value){
    value++;
    }
}
