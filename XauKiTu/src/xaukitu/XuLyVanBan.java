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
public class XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        while (sc.hasNext()) {
            String tmp = sc.next();
            s.append(tmp).append(" ");
        }
        s = new StringBuilder(s.toString().replace('?', '.'));
        s = new StringBuilder(s.toString().replace('!', '.'));
        s = new StringBuilder(s.toString().replace(". ", "."));
        s = new StringBuilder(s.toString().replace(" . ", "."));
        s = new StringBuilder(s.toString().replace(" .", "."));
        String[] a = s.toString().trim().split("\\.");
        for (String x : a)
            System.out.println(Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase());
    }
        
}
