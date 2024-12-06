/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangTheoDoiNhapXuatHang;

import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            a.add(new DonHang(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        for (DonHang x : a) {
            System.out.println(x);
        }
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
