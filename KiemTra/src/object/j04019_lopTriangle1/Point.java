
package object.j04019_lopTriangle1;

import java.util.Scanner;


public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point other) {
        return Math.sqrt(
                Math.pow(this.x - other.x, 2) + 
                Math.pow(this.y - other.y, 2)
        );
    }
    
    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
}
