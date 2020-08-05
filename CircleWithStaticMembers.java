package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */

public class CircleWithStaticMembers {
    double radius;
    static int numberofobjects=0;
    CircleWithStaticMembers(){
    radius=1;
    numberofobjects++;
    }
    CircleWithStaticMembers(double newradius){
    radius=newradius;
    numberofobjects++;
    }
    static int getNumberOfObjects(){
    return numberofobjects;
    }
    double getArea(){
    return radius*radius*Math.PI;
    }
}