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
public class BoiSoChungNhoNhatCuaNSoNguyenDuongDauTien {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long bcnn = 1;
            for(long i = 2; i <= n; i++){
                bcnn = (long)i*bcnn/gcd(i, bcnn);
            }
            System.out.println(bcnn);
        }
    }
}
