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
public class DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++){
                while(!st.isEmpty() && a[i] >= a[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    System.out.print((i + 1) + " ");
                } else {
                    System.out.print(i - st.peek());
                    System.out.print(" ");
                }
                st.push(i);
            }
            System.out.println("");
        }
    }
}
