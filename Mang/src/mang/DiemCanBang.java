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
public class DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long sum1 = 0, sum = 0;
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            boolean check = true;
            for(int i = 0 ; i < n; i++){
                if(sum - sum1 - a[i] == sum1){
                    System.out.println(i + 1);
                    check = false;
                    break;
                }
                sum1 += a[i];
            }
            if(check) System.out.println("-1");
        }
        
    }
}
