/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

import java.util.Scanner;

class PhanSo1 {
    private long a, b;

    PhanSo1(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public long gcd(long x, long y){
        if(y == 0) return x;
        return gcd(y, x%y);
    }

    @Override
    public String toString() {
        long uc = gcd(a, b);
        return (a / uc) + "/" + (b / uc);
    }
}

public class PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        PhanSo1 x = new PhanSo1(a, b);
        System.out.println(x);
        sc.close();
    }
}

