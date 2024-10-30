/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.Scanner;
/**
 *
 * @author Hoang Van Khoi
 */
public class BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();  
            long[] a = new long[n];  
            int b = 0;

          
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                a[i] *= a[i];  
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long x = a[i] + a[j];
                    if (Math.sqrt(x) == (int) Math.sqrt(x)) {  
                        for (int k = i + 1; k < n; k++) {
                            if (a[k] == x) { 
                                System.out.println("YES");
                                b = 1;
                                break;
                            }
                        }
                        if (b == 1) break;
                    }
                }
                if (b == 1) break;
            }

            if (b == 0)
                System.out.println("NO");
        }
        sc.close();  
    }
}
