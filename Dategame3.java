package object.oriented.programming;

/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Date;
public class Dategame3 {
public static void main(String args[]){
Date date = new Date(1234567);
m1(date);
System.out.println(date.getTime());
}
public static void m1(Date date){
date=null;
System.out.println(date.getClass());
}
}
