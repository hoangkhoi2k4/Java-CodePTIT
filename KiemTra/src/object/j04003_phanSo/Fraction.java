
package object.j04003_phanSo;


public class Fraction {
    private long x, y;

    public Fraction(long x, long y) {
        long g = gcd(x, y);
        this.x = x/g;
        this.y = y/g;
    }
    
    private long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    @Override
    public String toString() {
        return x + "/" + y;
    }
}
