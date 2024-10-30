/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class UocChungLonNhatCuaSoNguyenLon {
    private static long mod(long a, String b){
        long res = 0;
        for(int i = 0; i < b.length(); i++){
            res = res * 10 + (b.charAt(i) - '0');
            res %= a;
        }
        return res;
    }
    
    private static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            sc.nextLine();
            String b = sc.nextLine();
            System.out.println(gcd(mod(a, b), a));
        }
    }
}
