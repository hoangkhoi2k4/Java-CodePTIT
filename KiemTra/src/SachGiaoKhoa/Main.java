/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SachGiaoKhoa;

/**
 *
 * @author Hoang Van Khoi
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sach s = new SachGiaoKhoa();
        ((SachGiaoKhoa) s).nhap(in);
        System.out.println(s);
        ((SachGiaoKhoa) s).nhap(in);
        System.out.println(s);
    }
}

