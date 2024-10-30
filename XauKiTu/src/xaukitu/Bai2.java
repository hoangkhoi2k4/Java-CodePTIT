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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String res = "";
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    sum = sum + (s.charAt(i) - '0');
                } else {
                    res = res + s.charAt(i);
                }
            }
            char[] x = res.toCharArray();
            Arrays.sort(x);
            String kq = new String(x);
            System.out.println(kq + String.valueOf(sum));
        }
    }
}
