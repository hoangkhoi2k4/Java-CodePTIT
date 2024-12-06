
package object.j04018_soPhuc;


public class Complex {
    private int a, b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public Complex add(Complex o) {
        return new Complex(this.a + o.a, this.b + o.b);
    }
    
    public Complex mul(Complex o) {
        return new Complex(
                this.a * o.a - this.b * o.b, 
                this.a * o.b + this.b * o.a
        );
    }

    @Override
    public String toString() {
        if(b < 0) {
            return a + " - " + (b*-1) + "i";
        }
        return a + " + " + b + "i";
    }
}
