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
public class BienSoDep {
    private static boolean check(String s){
        int a = s.charAt(5) - '0';
        int b = s.charAt(6) - '0';
        int c = s.charAt(7) - '0';
        int d = s.charAt(9) - '0';
        int e = s.charAt(10) - '0';
        if(b == a + 1 && c == b + 1 && d == c + 1 && e == d + 1){
            return true;
        } else if(a == b && b == c && c == d && d == e){
            return true;
        } else if(a == b && b == c && d == e){
            return true;
        } else if((a == 6 || a == 8) && (b == 6 || b == 8) && (c == 6 || c == 8) && (d == 8 || d == 6) && (e == 6 || e == 8)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
