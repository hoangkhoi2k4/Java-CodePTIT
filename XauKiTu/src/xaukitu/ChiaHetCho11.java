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
public class ChiaHetCho11 {
    private static boolean check(String s){
        int c = 0, l = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 1) c += s.charAt(i) - '0';
            if(i % 2 == 0) l += s.charAt(i) - '0';
        }
        if(Math.abs(l - c) % 11 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();;
            if(check(s)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
