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
public class TinhLuyThua {
    public static long mod = 1000000007;
    public static long Pow(long a, long b){
        long res = 1;
        while(b != 0){
            if(b%2 == 1){
                res *= (a%mod);
                res%= mod;
            }
            a*=a;
            a%=mod;
            b /= 2;
        }
        return res%mod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(Pow(a, b));
        }
    }
}
