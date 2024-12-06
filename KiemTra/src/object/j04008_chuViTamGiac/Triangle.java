
package object.j04008_chuViTamGiac;


public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public String toString() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        if(a + b <= c || a + c <= b || b + c <= a) {
            return "INVALID";
        } else {
            return String.format("%.3f", a + b + c);
        }
    }
}
