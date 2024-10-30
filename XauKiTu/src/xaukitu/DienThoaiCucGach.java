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
public class DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        Map<Character, Character> charToNum = new HashMap<>();
        charToNum.put('A', '2'); charToNum.put('B', '2'); charToNum.put('C', '2');
        charToNum.put('D', '3'); charToNum.put('E', '3'); charToNum.put('F', '3');
        charToNum.put('G', '4'); charToNum.put('H', '4'); charToNum.put('I', '4');
        charToNum.put('J', '5'); charToNum.put('K', '5'); charToNum.put('L', '5');
        charToNum.put('M', '6'); charToNum.put('N', '6'); charToNum.put('O', '6');
        charToNum.put('P', '7'); charToNum.put('Q', '7'); charToNum.put('R', '7'); charToNum.put('S', '7');
        charToNum.put('T', '8'); charToNum.put('U', '8'); charToNum.put('V', '8');
        charToNum.put('W', '9'); charToNum.put('X', '9'); charToNum.put('Y', '9'); charToNum.put('Z', '9');
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toUpperCase();
            String res = "";
            for(int i = 0; i < s.length(); i++){
                res += charToNum.get(s.charAt(i));
            }
            boolean check = true;
            for(int i = 0; i < res.length()/2; i++){
                if(res.charAt(i) != res.charAt(res.length() - i - 1)){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
