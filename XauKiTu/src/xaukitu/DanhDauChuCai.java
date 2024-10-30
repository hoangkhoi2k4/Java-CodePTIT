/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;
import java.util.*;
import java.lang.Character;
/**
 *
 * @author Hoang Van Khoi
 */
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> se = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
    }
}
