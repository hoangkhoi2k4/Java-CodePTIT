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
public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String[] words = s.split("\\s+");
            
            String res = "";
            for(int i = 1; i < words.length ;i++){
                String tmp  = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                res += tmp;
                if(i == words.length - 1)
                    res += ", ";
                else res += " ";
            }
            
            res += words[0].toUpperCase();
            System.out.println(res);
        }
    }
}
