package Models;
public class Numbers {
    public void printNumber(int m, int n){
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println( "m=" + m + " " + "n=" + n);
    }
}

