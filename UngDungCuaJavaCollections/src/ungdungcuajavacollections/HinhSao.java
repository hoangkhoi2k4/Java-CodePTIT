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

// 1 đỉnh có bậc n - 1, các đỉnh còn lại có bậc là 1
public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] degree = new int[n+1];
        for(int i = 1; i <= n - 1; i++){
            degree[sc.nextInt()]++;
            degree[sc.nextInt()]++;
        }
        int cnt1 = 0, cnt2 = 0;
        for(int i = 1; i <= n ; i++){
            if(degree[i] == 1){
                cnt1++;
            }
            if(degree[i] == n - 1){
                cnt2++;
            }
        }
        if(cnt1 == n - 1 && cnt2 == 1){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
