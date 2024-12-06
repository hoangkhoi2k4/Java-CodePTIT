/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanPhanSo;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = PhanSo.mul(PhanSo.add(a, b), PhanSo.add(a, b));
            PhanSo d = PhanSo.mul(a, b);
            PhanSo e = PhanSo.mul(d, c);
            System.out.print(c + " ");
            System.out.println(e);
        }
    }
}
