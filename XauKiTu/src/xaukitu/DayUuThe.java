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
public class DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            int c = 0, l = 0, len = a.length;
            for(int i = 0; i < len; i++){
                if((a[i].charAt(a[i].length() - 1) - '0' ) % 2 == 0 ){
                    c++;
                } else {
                    l++;
                }
            }
            if((len%2 == 0 && c > l) || (len%2 == 1) && l > c){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

//2
//11 22 33 44 55 66 77
//23 34 45 56 67 78 89 90 121 131 141 151 161 171
