/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhcobanjava;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t > 0) {
            String s = sc.nextLine();
            boolean check = true;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0' || c == '1') {
                    result.append(c);
                } else if (c == '8' || c == '9') {
                    result.append('0');
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                String finalResult = result.toString().replaceFirst("^0+(?!$)", "");
                if (finalResult.isEmpty() || finalResult.matches("^0+$")) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(finalResult);
                }
            } else {
                System.out.println("INVALID");
            }
            t--;
        }
        sc.close();
    }
}