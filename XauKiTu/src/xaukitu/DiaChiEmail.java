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
public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        Map<String, Integer> m = new HashMap<>();
        while (t-- > 0) {
            String a = sc.nextLine().trim();
            String[] list = a.split("\\s+");
            String res = "";

            res += list[list.length - 1].toLowerCase();

            for (int i = 0; i < list.length - 1; i++) {
                res += list[i].toLowerCase().charAt(0);
            }
            
            if (m.containsKey(res)) {
                int count = m.get(res) + 1;
                m.put(res, count);
                res += count; 
            } else {
                m.put(res, 1);
            }

            System.out.println(res + "@ptit.edu.vn");
        }
    }
}

