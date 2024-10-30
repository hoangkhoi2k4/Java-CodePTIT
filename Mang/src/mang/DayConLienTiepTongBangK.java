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
public class DayConLienTiepTongBangK {
    private static boolean check(int n, long[] a, long k){
        long sum = 0;
        Set<Long> s = new HashSet<>();
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(sum == k || a[i] == k || s.contains(sum - k)){
                return true;
            }
            s.add(sum);
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); long k = sc.nextLong();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            if(check(n, a, k)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
