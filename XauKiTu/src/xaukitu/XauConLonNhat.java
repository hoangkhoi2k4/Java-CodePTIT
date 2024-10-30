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
public class XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        char x = 'a';
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) >= x){
                res = s.charAt(i) + res;
                x = s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
