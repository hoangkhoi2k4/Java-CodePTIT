 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> s1 = new TreeSet();
        for(int i = 0; i < n; i++){
            s1.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            s1.add(sc.nextInt());
        }
        
        for(Integer num : s1){
            System.out.print(num + " ");
        }
    }
}
