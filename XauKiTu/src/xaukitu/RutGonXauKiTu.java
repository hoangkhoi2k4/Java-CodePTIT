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
public class RutGonXauKiTu {
    private static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         for(int i = 0; i < s.length() - 1; i++){
             if(s.charAt(i) == s.charAt(i + 1)){
                 s = removeCharAt(s, i);
                 s = removeCharAt(s, i);
                 i = -1;
             }
         }
         if(s.length() == 0){
             System.out.println("Empty String");
         } else {
             System.out.println(s);
         }
         
    }
}
