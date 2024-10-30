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
public class SoLienKe {
    public static boolean check(long n){
        long d = n % 10;
        n /= 10;
        while(n != 0){
            long c = n % 10;
            if(Math.abs(d - c) != 1){
                return false;
            }
            n/= 10;
            d = c;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(check(n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
