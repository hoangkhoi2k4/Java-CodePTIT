/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;
import java.util.*;
import java.lang.Character;
/**
 *
 * @author Hoang Van Khoi
 */
public class SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(s.length() % 2 == 0){
                boolean check = false;
                int cnt1 =0, cnt2 = 0;
                for(int i = 0; i < s.length(); i++){
                    if(Character.isDigit(s.charAt(i))){
                        if((s.charAt(i) - '0') % 2  == 0){
                            cnt1 ++;
                        } else {
                            cnt2++;
                        }
                    } else {
                        check = true;
                        break;
                    }
                }
                if(check) {
                    System.out.println("INVALID");
                } else {
                    if(cnt1 > cnt2){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            } else {
                boolean check = false;
                int cnt1 =0, cnt2 = 0;
                for(int i = 0; i < s.length(); i++){
                    if(Character.isDigit(s.charAt(i))){
                        if((s.charAt(i) - '0') % 2  == 0){
                            cnt1 ++;
                        } else {
                            cnt2++;
                        }
                    } else {
                        check = true;
                        break;
                    }
                }
                if(check) {
                    System.out.println("INVALID");
                } else {
                    if(cnt2 > cnt1){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
