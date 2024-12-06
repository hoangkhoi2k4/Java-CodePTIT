
package object.j04020_lopPair;


public class Pair<T1, T2> {
    private T1 t1;
    private T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    
    private boolean check(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    
    public boolean isPrime() {
        try {
            int x = Integer.parseInt(t1.toString());
            int y = Integer.parseInt(t2.toString());
            return check(x) && check(y);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return t1.toString() + " " + t2.toString();
    }
}
