package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class SwapCircle {
    public static void main(String[ ] aegs){
    Circle circle1=new Circle(4);
    Circle circle2=new Circle(5);
    Swap1(circle1, circle2);
    System.out.println("After swap1: circle1 = " + 
            circle1.Radius + " circle2 = " + circle2.Radius);
    Swap2(circle1, circle2);
    System.out.println("After swap2: circle1 = " +
    circle1.Radius + " circle2 = " + circle2.Radius);
    
    }
   public static void Swap1(Circle x,Circle y){
        Circle temp=x;
        x=y;
        y=temp;
    }
    public static void Swap2(Circle x, Circle y){
        double temp = x.Radius;
        x.Radius=y.Radius;
        y.Radius=temp;
    }
}
    class Circle{
        double Radius;
        Circle(double newR adius){
        Radius=newRadius;
    }
}