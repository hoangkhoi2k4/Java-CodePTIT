/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class LietKeTopHop2 {
    public static int n, k, cnt = 0;
    public static int[] a = new int[20];
    public static void Try(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                for(int h = 1; h <= k; h++){
                    System.out.print(a[h]);
                }
                System.out.print(" ");
                cnt++;
            } else Try(i + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a[0] = 0;
        Try(1);
        System.out.println("\nTong cong co " + cnt + " to hop");
    }
}
