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
public class MaHoaDRM {
    public static Map<Character, Integer> m1 = new HashMap<>();
    public static Map<Integer, Character> m2 = new HashMap<>();
    
    public static String Rotate(String s){
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += m1.get(c);
        }
        sum = sum % 26;
        String res = "";
        for(char c : s.toCharArray()){
            res += m2.get((m1.get(c) + sum)%26);
        }
        return res;
    }
    
    public static String Merger(String s1, String s2){
        String res = "";
        for(int i = 0; i < s1.length(); i++){
            res += m2.get((int)(m1.get(s1.charAt(i)) + m1.get(s2.charAt(i))) % 26);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 26; i++){
            char ch = (char) ('A' + i); 
            m1.put(ch, i);             
            m2.put(i, ch);  
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int len = s.length();
            String s1 = s.substring(0, len/2);
            String s2 = s.substring(len/2);
            s1 = Rotate(s1);
            s2 = Rotate(s2);
            System.out.println(Merger(s1, s2));
        }
    }
}
//3
//EWPGAJRB
//BB
//TPQJDRJWSQXGRRIPXFMINTELHBJA