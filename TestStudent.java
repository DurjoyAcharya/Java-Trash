package object.oriented.programming;

/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Scanner;
public class TestStudent {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i=sc.nextInt();
    String s=sc.nextLine();
Student student=new Student(i,s);
String a=student.getName();
int b=student.getId();
System.out.println("----------------------------------------");
System.out.println(("Name: "+a+" \nID: "+b).toString());
}
}
