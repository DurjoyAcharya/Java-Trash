package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Scanner;
import javafx.geometry.Point2D;
public class TestPoint2D {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter point1's x-, y- coordinate");
    double x1=sc.nextDouble();
    double y1=sc.nextDouble();
    System.out.println("Enter point2's x-, y- coordinate");
    double x2=sc.nextDouble();
    double y2=sc.nextDouble();
    Point2D p1=new Point2D(x1,y1);
    Point2D p2=new Point2D(x2,y2);
    System.out.println("P1 is "+p1.toString());
    System.out.println("P2 is "+p2.angle(p2));
    System.out.println("The Distance between p1 and p2 "+p1.distance(p2));
    
    }
}
