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
public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String words[] = s.split("\\s+");
            String res = "";
            for(String word : words){
                if(!word.isEmpty()){
                    String tmp = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                    res += tmp;
                    res += " ";
                }
            }
            String final_ = res.trim();
            System.out.println(final_);
        }
    }
}
