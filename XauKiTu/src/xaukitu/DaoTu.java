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
public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String ip = sc.nextLine();
            String[] list = ip.split("\\s+");
            for(String x : list){
                StringBuilder s = new StringBuilder(x);
                System.out.print(s.reverse() + " ");
            }
            System.out.println("");
        }
    }
}
