/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhcobanjava;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= 0 || b <= 0) {
            System.out.print("0");
        } else {
            System.out.print((long)(a+b)*2 +" " + (long)a*b);
        }
    }
}
