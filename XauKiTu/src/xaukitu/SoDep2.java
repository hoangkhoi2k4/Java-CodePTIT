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
public class SoDep2 {
    private static boolean tong(String s){
        long sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += (s.charAt(i) - '0');
        }
        return sum%10 == 0;
    }
    
    private static boolean check(String s){
        if(s.charAt(0) != '8' && s.charAt(s.length() - 1) != '8'){
            return false;
        }
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }    
        }
        if(tong(s)){
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
