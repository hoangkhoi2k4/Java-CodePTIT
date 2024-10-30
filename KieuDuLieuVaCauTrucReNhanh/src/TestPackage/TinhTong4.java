/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class TinhTong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = (long) n*(n+1);
        System.out.println(res);
    }
}

/*
INPUT:
3
OUTPUT:
12
*/