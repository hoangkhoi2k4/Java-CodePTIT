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
public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            int res = 0;
            st.push(-1);
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '('){
                    st.push(i);
                } else {
                    st.pop();
                    if(!st.empty()){
                        res = Math.max(res, i - st.peek());
                   }
                   if(st.empty()) st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}

//3
//((()
//)()())
//()(()))))
