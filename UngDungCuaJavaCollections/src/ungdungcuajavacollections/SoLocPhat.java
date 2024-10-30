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
public class SoLocPhat {
    public static ArrayList<String> res = new ArrayList<>();
    public static void init(){
        Queue<String> q = new LinkedList<>();
        q.offer("6");
        q.offer("8");
        res.add("6");
        res.add("8");
        while(true){
            String tmp = q.poll();
            if(tmp.length() == 15) break;
            res.add(tmp + "6");
            res.add(tmp + "8");
            q.offer(tmp + "6");
            q.offer(tmp + "8");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Stack<String> st =  new Stack<>();
            for(String x : res){
                if(x.length() <= n){
                    st.push(x);
                } else{
                    break;
                }
            }
            System.out.println(st.size());
            while(!st.isEmpty()){
                System.out.print(st.peek() + " ");
                st.pop();
            }
            System.out.println("");
        }
    }
}
