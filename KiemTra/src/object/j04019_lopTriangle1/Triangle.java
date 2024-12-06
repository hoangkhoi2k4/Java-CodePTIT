
package object.j04019_lopTriangle1;


public class Triangle {
    private double a, b, c;

    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1.distance(p2);
        this.b = p1.distance(p3);
        this.c = p2.distance(p3);
    }
    
    public boolean valid() {
        return  a + b > c && a + c > b && b + c > a;
    }
    
    public String getPerimeter() {
        return String.format("%.3f", a + b + c);
    }
}
