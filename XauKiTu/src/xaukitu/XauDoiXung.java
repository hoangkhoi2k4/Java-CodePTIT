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
public class XauDoiXung {

    private static boolean find(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                cnt++;
            }
        }
        if ((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 == 1 && cnt <= 1))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (find(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
