package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class TestCircleWithStaticMembers {
public static void main(String[] args){
System.out.println("Before Creating objects");
System.out.println("The number of circle objects is "+
        CircleWithStaticMembers.numberofobjects);
CircleWithStaticMembers c1=new CircleWithStaticMembers();
System.out.println("\nAfter Creating C1");
System.out.println("c1: radius ("+c1.radius+")and number of circle objects("+c1.numberofobjects+ ")");

CircleWithStaticMembers c2= new CircleWithStaticMembers(5);
c1.radius=9;
System.out.println("\n After creating c2 and modifying c1");
System.out.println("c1: radius ("+c1.radius+")and number of circle objects("+c1.numberofobjects+ ")");
System.out.println("c1: radius ("+c2.radius+")and number of circle objects("+c2.numberofobjects+ ")");
System.out.println(c2.getArea());
}
}
