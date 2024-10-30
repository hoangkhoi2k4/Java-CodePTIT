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
public class HieuHaiSoNguyenLon1 {
    private static boolean compare(String a, String b){
        if(a.length() == b.length()){
            return a.compareTo(b) > 0;
        }
        return a.length() > b.length();
    }
    
    private static String subtract(String a, String b) {
        int len = Math.max(a.length(), b.length());
        while (b.length() < len)
            b = "0" + b;

        String res = "";
        int nho = 0;
        for (int i = len - 1; i >= 0; i--) {
            int tmp = (a.charAt(i) - '0') - (b.charAt(i) - '0') - nho;
            if (tmp < 0) {
                tmp += 10;
                nho = 1;
            } else {
                nho = 0;
            }
            res = String.valueOf(tmp) + res;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            if(compare(a, b)){
                System.out.println(subtract(a, b));
            } else {    
                System.out.println(subtract(b, a));
            }
        }
        sc.close();
    }
}
