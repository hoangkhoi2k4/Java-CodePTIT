/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChoiChoi;

import java.util.Scanner;

class PhanSo1 {
    long a;
    long b;

    public PhanSo1(long a, long b) {
        this.a = a; 
        this.b = b;
    }

    public long gcd(long x, long y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

    public PhanSo1 tong(PhanSo1 x, PhanSo1 y) {
        PhanSo1 res = new PhanSo1(1, 1);
        res.b = x.lcm(x.b, y.b);
        res.a = x.a * (res.b/ x.b) + y.a * (res.b / y.b);
        return res;
    }

    @Override
    public String toString() {
        long uc = gcd(a, b);
        return (a / uc) + "/" + (b / uc);
    }
}

public class TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        PhanSo1 a = new PhanSo1(x1, y1);
        PhanSo1 b = new PhanSo1(x2, y2);
        PhanSo1 Tong = a.tong(a, b);
        System.out.println(Tong);
        sc.close();
    }
}
