/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ungdungcuajavacollections;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Hoang Van Khoi
 */
public class KiemTraDayNgoacDung {
    private static boolean check(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case ')':
                    if(st.empty() || st.peek() != '('){
                        return false;
                    }
                    st.pop();
                    break;
                case '}':
                    if(st.empty() || st.peek() != '{'){
                        return false;
                    }
                    st.pop();
                    break;
                case ']':
                    if(st.empty() || st.peek() != '['){
                        return false;
                    }
                    st.pop();
                    break;
                default:
                    st.push(c);
            }
                
        }
        return st.empty();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
//2
//[()]{}{[()()]()}
//[(])