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
public class TongGiaiThua {
    public static long giaiThua(int n){
        if(n == 0 || n == 1) {
            return 1;
        } 
        return giaiThua(n-1)*n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += giaiThua(i);
        }
        System.out.println(sum);
    }
}
