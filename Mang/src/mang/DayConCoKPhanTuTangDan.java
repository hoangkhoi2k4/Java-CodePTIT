/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class DayConCoKPhanTuTangDan {
    static int n, k;
    static Integer[] a = new Integer[50];
    static int[] x = new int[50];
    public static void Try(int i){
        for(int j = x[i - 1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                for(int l = 1; l <= k; l++){
                    System.out.print(a[x[l]] + " ");
                }
                System.out.println("");
            } else {
                Try(i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt(); k = sc.nextInt();
            a[0] = 0;
            for(int i = 1 ; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,1, n + 1);
            Try(1);
        }
    }
}
