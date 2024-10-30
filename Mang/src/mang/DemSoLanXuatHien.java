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
public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = t;
        while(t-- > 0){
           
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> m = new HashMap();
            for(int i = 0; i < n ; i++){
                int num = sc.nextInt();
                a[i] = num;
                if(m.containsKey(num)){
                    m.put(num, m.get(num) + 1);
                } else {
                    m.put(num, 1);
                }
            }
            System.out.println("Test " + (test - t) + ":");
            for(int i = 0; i < n; i++){
                if(m.containsKey(a[i]) && m.get(a[i]) != 0){
                    System.out.println(a[i] + " xuat hien " + m.get(a[i]) + " lan");
                    m.put(a[i], 0);
                }
            }
//            for(Map.Entry<Integer, Integer> en : m.entrySet()){
//                System.out.println(en.getKey() + " xuat hien " + en.getValue() + " lan");
//            }
        }
    }
}
