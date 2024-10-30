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
public class LoaiBo100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = -1; i <= s.length(); i++) {
                a.add(i);
            }
            s = " " + s + " ";
            while (s.contains("100")) {
                int index = s.indexOf("100");
                s = s.substring(0, index) + s.substring(index + 3);
                for (int j = 0; j < 3; j++) {
                    a.remove(index);
                }
            }
            int ans = 0;
            for(int i = 1; i < a.size(); i++){
                ans = Math.max(ans, a.get(i) - a.get(i - 1) - 1);
            }    
            System.out.println(ans);
        }
    }
}

//2
//010010
//1011110000
