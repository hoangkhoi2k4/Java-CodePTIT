/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DienTichTamGiac;

import java.util.*;
import DienTichTamGiac.Point;

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
                double res;
                double p = (a + b + c)/2;
                res = Math.sqrt(p*(p - a)*(p - b)*(p - c));
                System.out.println(String.format("%.2f", res));
            }
        }
    }
}
