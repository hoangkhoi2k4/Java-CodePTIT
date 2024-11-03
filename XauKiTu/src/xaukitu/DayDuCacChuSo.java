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
public class DayDuCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long x = n;
            if(n == 0){
                System.out.println("Impossible");
                continue;
            }
            Map<Character, Integer> m = new HashMap<>();
            while(true){
                String s = x + "";
                for(char c : s.toCharArray()){
                    m.put(c, m.getOrDefault(c, 0) + 1);
                }
                if(m.size() == 10) {
                    System.out.println(x);
                    break;
                }
                x += n;
            }
            
        }
    }
}
