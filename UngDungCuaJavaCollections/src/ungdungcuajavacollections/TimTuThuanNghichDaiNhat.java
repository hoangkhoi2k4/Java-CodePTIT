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
public class TimTuThuanNghichDaiNhat {
    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        int max_len = -100000;
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                max_len = Math.max(max_len, s.length());
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    a.add(s);
                    mp.put(s, 1);
                }
            }
        }
        for (String x : a) {
            if (x.length() == max_len) {
                System.out.println(x + " " + mp.get(x));
            }
        }
    }
}
