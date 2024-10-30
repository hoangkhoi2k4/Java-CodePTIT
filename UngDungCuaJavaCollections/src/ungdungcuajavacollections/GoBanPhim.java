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
public class GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st1 = new Stack<>(), st2 = new Stack<>();
        
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case '>':
                    if(!st2.isEmpty()){
                        st1.push(st2.peek());
                        st2.pop();
                    }
                    break;
                case '<':
                    if(!st1.isEmpty()){
                        st2.push(st1.peek());
                        st1.pop();
                    }
                    break;
                case '-':
                    if(!st1.isEmpty()){
                        st1.pop();
                    }
                    break;
                default:
                    st1.push(c);
            }
        }
        
        while(!st1.isEmpty()){
            st2.push(st1.peek());
            st1.pop();
        }
        while(!st2.isEmpty()){
            System.out.print(st2.peek());
            st2.pop();
        }
        System.out.println("");
    }
}
