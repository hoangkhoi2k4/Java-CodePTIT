
package object.j04004_tongPhanSo;


public class Fraction {
    private long x, y;

    public Fraction(long x, long y) {
        long g = gcd(x, y);
        this.x = x / g;
        this.y = y / g;
    }
    
    public Fraction add(Fraction other) {
        Fraction res = new Fraction(
                this.x * other.y + other.x * this.y,
                this.y * other.y
        );
        return res;
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
