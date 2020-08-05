package object.oriented.programming;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class TheScopeVariable {
private static int i = 0;
private static int j = 0;
public static void main(String[] args) {
int i = 2;
int k = 3;
TheScopeVariable.j=25;
System.out.println(TheScopeVariable.j);
System.out.println(i+k);
int j = 3;
System.out.println("i + j is " + i + j);//this is magic cz String adding hare 
k = i + j;
System.out.println("k is " + k);
System.out.println("j is " + j);
}
}
