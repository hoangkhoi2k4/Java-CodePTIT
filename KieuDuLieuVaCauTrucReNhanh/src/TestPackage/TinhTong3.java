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
public class TinhTong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = (double) 1 - (double)1/(n+1);
        System.out.println(sum);
    }
}
