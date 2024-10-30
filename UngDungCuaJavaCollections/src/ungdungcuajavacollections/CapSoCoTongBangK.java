/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ungdungcuajavacollections;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class CapSoCoTongBangK {
    public static int first_pos(int[] a, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                res = m;
                r = m - 1; 
            } else if (a[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public static int last_pos(int[] a, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                res = m;
                l = m + 1;  
            } else if (a[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  
        
        while (t-- > 0) {
            int n = sc.nextInt();  
            int k = sc.nextInt(); 
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);  

            long cnt = 0;  
            for (int i = 0; i < n - 1; i++) {
                int l = first_pos(a, i + 1, n - 1, k - a[i]);
                int r = last_pos(a, i + 1, n - 1, k - a[i]);
                
                if (l != -1) {
                    cnt += r - l + 1;  
                }
            }
            
            System.out.println(cnt);  
        }

        sc.close();
    }
}
