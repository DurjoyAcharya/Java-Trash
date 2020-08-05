package arrays;
/**
 *
 * @author User
 */
public class VarArgsDemo {
    public static void main(String...r){
        printMax(new double[]{1.212,125.25,5,1.2});
    }
    public static void printMax(double... numbers) {
    if (numbers.length == 0) {
    System.out.println("No argument passed");
    return;
    }
    double result = numbers[0];

    for (int i = 0; i < numbers.length; i++)
    if (numbers[i] > result)
    result = numbers[i];

    System.out.println("The max value is " + result);
    }
 }
