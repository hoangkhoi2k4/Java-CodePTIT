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
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> s = new HashSet<Integer>();
        int ma = -1000;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            ma = Math.max(a[i], ma);
            s.add(a[i]);
        }
        boolean check = false;
        for(int i = 1; i <= ma; i++){
            if(!s.contains(i)){
                System.out.println(i);
                check = true;
            }
        }
        if(!check) System.out.println("Excellent!");
        
    }
}
