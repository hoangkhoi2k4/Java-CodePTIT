/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int i = 1;
        while (i < a.size()) {
            if ((a.get(i - 1) + a.get(i)) % 2 == 0) {
                a.remove(i);     
                a.remove(i - 1); 
                if (i > 1) {
                    i--; 
                }
            } else {
                i++; 
            }
        }

        System.out.println(a.size());
    }
}
