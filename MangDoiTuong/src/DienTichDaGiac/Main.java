/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DienTichDaGiac;
import java.util.Scanner;
import java.lang.Math;
 
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static double S(int n, int[] x, int[] y) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            sum += (x[i] * y[j] - x[j] * y[i]);
        }
        return Math.abs(sum) / 2.0;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt(); 
       while (t-- > 0) {
           int n = sc.nextInt();
           int[] x = new int[n]; 
           int[] y = new int[n]; 

           for (int i = 0; i < n; i++) {
               x[i] = sc.nextInt();
               y[i] = sc.nextInt();
           }

           double s = S(n, x, y);

           System.out.println(String.format("%.3f",s));
       }
       sc.close();
    }
}
