/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), ok = 0;
            Long a[] = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    ok = 1;
                    System.out.println(i);
                    break;
                }
            }
            if (ok == 0) {
                System.out.println(0);
            }
        }
    }
}
