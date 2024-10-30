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
public class UocSoNguyenToLonNhat {
    public static boolean isPrime(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = 0;
            boolean check = true;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(n%i == 0){
                    if(isPrime(n / i)){
                        System.out.println(n/i);
                        check = false;
                        break;
                    }
                    if(isPrime(i)){
                        m = i;
                    }
                }
            }
            if(check)
            System.out.println(m);
        }
    }
}
