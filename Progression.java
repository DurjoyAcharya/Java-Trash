package arrays;

/**
 *
 * @author User
 */
public class Progression {
    protected long current;
    public Progression(){this(0);}
    public Progression(long start) { current = start; }
    public long nextValue(){
    long answer = current;
    advance();
    return answer;
    }
    protected void anvance(){
    current++;
    }
    public void printProgression(int n){
    System.out.print(nextValue());
    for (int j=1; j < n; j++)
        System.out.print(" " + nextValue( ));
    System.out.println( );
    }

    private void advance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String...r){
    }
}
