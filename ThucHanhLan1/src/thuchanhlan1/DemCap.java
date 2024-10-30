/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlan1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class DemCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            
            while (!stack.isEmpty() && x > stack.peek()) {
                int top = stack.pop();
                cnt.put(top, cnt.get(top) - 1);
                ans++;
            }
            
            if (!stack.isEmpty()) {
                if (x == stack.peek()) {
                    ans += cnt.get(x) + (stack.size() > cnt.get(x) ? 1 : 0);
                } else {
                    ans++;
                }
            }
            
            stack.push(x);
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }
        
        System.out.println(ans);
    }
}
