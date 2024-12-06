
package object.j04014_tinhToanPhanSo;


public class Fraction {
    private long x, y;

    public Fraction(long x, long y) {
        this.x = x;
        this.y = y;
        long g = this.gcd(x, y);
        this.x /= g;
        this.y /= g;
    }
    
    private long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static Fraction calcC(Fraction a, Fraction b) {
        return new Fraction(
                (long)Math.pow(a.x * b.y + b.x * a.y, 2), 
                (long)Math.pow(a.y * b.y, 2)
        );
    }
    
    public static Fraction calcD(Fraction a, Fraction b, Fraction c) {
        return new Fraction(
                a.x * b.x * c.x, 
                a.y * b.y * c.y
        );
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }
}
