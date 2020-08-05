package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class CircleWithPrivateDataFields {
    private double radius=1;
    private static int numberofobjects=0; 
    public CircleWithPrivateDataFields(){
    numberofobjects++;
    }
    public CircleWithPrivateDataFields(double newRadius){
    radius=newRadius;
    numberofobjects++;
    }
    public double getradius(){
    return radius;
    }
    public void setRadius(double newRadius){
    radius=(newRadius>=0)?newRadius:0;
    }
    public static int getnumberofobjects(){
    return numberofobjects;
    }
    public double getArea(){
    return radius*radius*Math.PI;
    }
}
