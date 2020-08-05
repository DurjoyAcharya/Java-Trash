package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import object.oriented.programming.TV;
public class TestTv {
    public static void main(String[] arhs){
        TV samsung =new TV();
        samsung.turnon();
        samsung.setChannel(14);
        samsung.setvolume(4);
        samsung.channelUp();
        System.out.println("Samsung channel is "+samsung.Channel+" and volume lavel is "+samsung.Vlavel);
        System.out.println(Math.E);
        
    }
}
