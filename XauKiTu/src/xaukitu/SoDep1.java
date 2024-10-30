/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;
import java.util.Scanner;
/**
 *
 * @author Hoang Van Khoi
 */
public class SoDep1 {
    private static boolean check(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            } else if((s.charAt(i) - '0') % 2 == 1){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
