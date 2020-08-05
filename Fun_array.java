package Algorithoms;
/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class Fun_array {
    public static void main(String[] args){
    int[][] first=getarray1();
    int[][] second=getarray2();
    int[][] sum=new int[2][2];
    System.out.println("Enter the sum of two");
    for(int i=0;i<sum.length;i++){
        for(int j=0;j<sum[i].length;j++){
            sum[i][j]+=first[i][j]+second[i][j];
        System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }
    
    System.out.println(sum(first,second));
    }
    public static int[][] getarray1(){
    java.util.Scanner scan=new java.util.Scanner(System.in);
    System.out.println("Enter row");
    int row=scan.nextInt();
    System.out.println("Enter colums");
    int colums=scan.nextInt();
    int[][] m=new int[row][colums];
    System.out.println("Enter "+row+" * "+colums+" array");
    for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
            m[i][j]=scan.nextInt();
        }
    }
    
    
    return m;
    }
    public static int[][] getarray2(){
    java.util.Scanner scan=new java.util.Scanner(System.in);
    System.out.println("Enter row");
    int row=scan.nextInt();
    System.out.println("Enter colums");
    int colums=scan.nextInt();
    int[][] n=new int[row][colums];
    System.out.println("Enter "+row+" * "+colums+" array");
    for(int i=0;i<n.length;i++){
        for(int j=0;j<n[i].length;j++){
            n[i][j]=scan.nextInt();
        }
    }
    return n;
    }
    public static int sum(int[][] fuck,int[][] n){
        int total=0;
        for(int i=0;i<fuck.length;i++){
            for(int j=0;j<fuck[i].length;j++){
                total+=fuck[i][j];
            }
        }
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                total+=n[i][j];
            }
        }
        return total; 
        }
}