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
public class LuaChonThamLam {
    static int n, s;

    public static void maxNumber() {
        int[] a = new int[n];
        int s1 = s;
        for (int i = 0; i < n; i++) {
            if (s1 >= 9) {
                a[i] = 9;
                s1 -= 9;
            } else if (s1 < 9 && s1 > 0) {
                a[i] = s1;
                s1 = 0;
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }

    public static void minNumber() {
        int[] a = new int[n];
        int s1 = s - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (s1 >= 9) {
                a[i] = 9;
                s1 -= 9;
            } else if (s1 < 9 && s1 > 0) {
                a[i] = s1;
                s1 = 0;
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != 9) {
                a[i] += 1;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        if (s > 9 * n) {
            System.out.println("-1 -1");
        } else if (s == 0 && n == 1) {
            System.out.println("0 0");
        } else if (s == 0 && n > 1) {
            System.out.println("-1 -1");
        } else {
            minNumber();
            maxNumber();
        }
        sc.close();
    }
}
