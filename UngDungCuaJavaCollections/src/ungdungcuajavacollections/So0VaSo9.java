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
public class So0VaSo9 {
    public static long[] a = new long[101];
    public static ArrayList<Long> res = new ArrayList<>();
    
    public static void init(){
        Queue<String> q = new LinkedList<>();
        q.offer("9");
        res.add(9L);
        while(true){
            String tmp = q.peek();
            q.poll();
            if(tmp.length() == 15){
                break;
            }
            res.add(Long.valueOf(tmp + "0"));
            res.add(Long.valueOf(tmp + "9"));
            q.offer(tmp + "0");
            q.offer(tmp + "9");
        }
        
        for(int i = 1; i <= 100; i++){
            for(long x : res){
                if(x % i == 0){
                    a[i] = x;
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
