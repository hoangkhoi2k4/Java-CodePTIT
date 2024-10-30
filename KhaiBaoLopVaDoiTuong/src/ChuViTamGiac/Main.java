/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuViTamGiac;
import java.util.*;
import ChuViTamGiac.Point;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point x = new Point(sc.nextDouble(), sc.nextDouble());
            Point y = new Point(sc.nextDouble(), sc.nextDouble());
            Point z = new Point(sc.nextDouble(), sc.nextDouble());
            double a = x.distance(y);
            double b = y.distance(z);
            double c = z.distance(x);
            if(a + b <= c || a + c <= b || c + b <= a){
                System.out.println("INVALID");
            } else {
                System.out.println(String.format("%.3f", a + b + c));
            }
        }
    }
}
//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0   