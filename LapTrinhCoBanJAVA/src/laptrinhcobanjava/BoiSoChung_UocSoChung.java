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
public class BoiSoChung_UocSoChung {
    
    public static long USCLN(long a, long b){
        if(b == 0) return a;
        return USCLN(b, a%b);
    }
    public static long BSCNN(long a, long b){
        long uc = USCLN(a, b);
        return (long)(a*b/uc);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(BSCNN(a, b) + " " + USCLN(a, b));
            t--;
        }
        
        
    }
}
