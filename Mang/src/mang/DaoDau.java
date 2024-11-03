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
public class DaoDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long sum = 0;
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }

        Collections.sort(a);

        for (int i = 0; i < n && k > 0; i++) {
            if (a.get(i) < 0) {
                a.set(i, -a.get(i)); 
                k--;
            } else {
                break; 
            }
        }

        for (int value : a) {
            sum += value;
        }
        if (k % 2 != 0) {
            int min = Collections.min(a);
            sum -= 2 * min;
        }

        System.out.println(sum);
    }
}
//6 2
//-2 2 2  1 3 4