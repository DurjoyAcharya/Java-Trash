package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<<da-durjoy@outlook.com>>
 */
public class TestCircleWithPrivateDataFields {
public static void main(String arsg[]){
    CircleWithPrivateDataFields cpdf=new CircleWithPrivateDataFields();
    for(double j=1;j<6;j++){
        cpdf.setRadius(j);
    System.out.println("For Radius---"+cpdf.getradius()+" And Area---- "+cpdf.getArea());
    }
}
}
