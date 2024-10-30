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
public class KiemTraFibonacci {
    public static long[] a = new long[93];
    public static void khoitao(){
        a[0] = -1;
        a[1] = 0;
        a[2] = 1;
        for(int i = 3; i <= 92;i++){
            a[i] = a[i - 1] + a[i - 2];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        khoitao();
        while(t != 0){
            long n = sc.nextLong();
            boolean kt = false;
            for(int i = 1; i <= 92; i++){
                if(a[i] == n){
                    kt = true;
                    break;
                }
            }
            if(kt == true){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        
    }
}
