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
public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            boolean check = false;
            for(int j = 0; j < n - i -  1; j++){
                if(a[j + 1] < a[j]){
                    check = true;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            if(check){
                System.out.print("Buoc " + (i + 1) + ": ");
                for(int x : a){
                    System.out.print(x + " ");
                }
                System.out.println("");
            } else break;
            
        }
    }
}
