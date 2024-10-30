/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhcobanjava;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Hoang Van Khoi
 */
public class SoNguyenTo {
    
    public static boolean Prime(long n){
        if(n < 2) return false;
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            long n = sc.nextLong();
            if(Prime(n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
    
}
