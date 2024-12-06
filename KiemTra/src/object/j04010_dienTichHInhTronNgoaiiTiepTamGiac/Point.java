
package object.j04010_dienTichHInhTronNgoaiiTiepTamGiac;

import java.math.MathContext;


public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point o) {
        return Math.sqrt(
                Math.pow(this.x - o.x, 2) + 
                Math.pow(this.y - o.y, 2)
        );
    }
}
