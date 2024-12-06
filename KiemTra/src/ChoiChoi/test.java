/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChoiChoi;

/**
 *
 * @author Hoang Van Khoi
 */
import java.util.Scanner;

public class PhanSo {
    int a;
    int b;

    private PhanSo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int Solve() {
        int a = this.a;
        int b = this.b;
        while (a != b) {
            if (a < b)
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PhanSo x = new PhanSo(a,b);
        int c = x.Solve();
        System.out.println(x.a/c + "/" + x.b/c);
        sc.close();
    }
}