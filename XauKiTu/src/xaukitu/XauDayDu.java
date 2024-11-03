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
public class XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            Set<Character> se = new HashSet<>();
            for(char c : s.toCharArray()){
                se.add(c);
            }
            if(se.size() + k >= 26){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
