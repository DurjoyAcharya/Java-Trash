package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class ThisKey {
private double radius=2;
protected int fuck=44;
public  double area(){
return radius*radius*Math.PI;
}
public String toString() {
return "radius: " + radius
+ " area: " + area() ;
}
public static void main(String args[]){
    ThisKey h=new ThisKey();
    double a=h.area();
    String b=h.toString();
    System.out.println(a);
    System.out.println(b);
    int s=h.fuck;
    System.out.println(s);
    F f= new F();
    int x=f.setI(2);
    double y=f.setK(5.25);
    System.out.println(x);
    System.out.println(y);
}
}
class F {//This is another magic box hahahahahah
private int i = 5;
private static  double k = 0;
public int setI(int i) {
this.i = i;
return i;
}
public  double setK(double k) {
F.k = k;
return k;
}
// Other methods omitted
}