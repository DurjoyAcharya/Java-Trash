package Algorithoms;

/**
 *
 * @author User
 */
import java.util.Date;
public class OOP {

   public static void main(String[] args) {

        long time = 10000;
        for (int i = 0; i < 8; i++, time *= 10) {
            Date date = new Date(time);
            System.out.println(date.toString());
        }
    }
}
