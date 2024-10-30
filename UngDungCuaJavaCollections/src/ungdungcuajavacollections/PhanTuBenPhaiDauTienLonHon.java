/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ungdungcuajavacollections;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class PhanTuBenPhaiDauTienLonHon {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); 
            int[] a = new int[n];
            int[] r = new int[n]; 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                while (!stack.isEmpty() && a[stack.peek()] <= a[i]) {
                    stack.pop();
                }
               
                if (stack.isEmpty()) {
                    r[i] = -1;
                } else {
                    r[i] = a[stack.peek()]; 
                }

                stack.push(i);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(r[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
//3
//4
//4 5 2 25
//3
//2 2 2
//4
//4 4 5 5