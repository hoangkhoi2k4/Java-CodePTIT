/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;

/**
 *
 * @author Hoang Van Khoi
 */
import java.util.Scanner;

public class SoLaMa {
    private static final int[] values = {1, 5, 10, 50, 100, 500, 1000};
    private static final char[] romanChars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    private static int findPos(char c) {
        for (int i = 0; i < romanChars.length; i++) {
            if (romanChars[i] == c) {
                return i;
            }
        }
        return -1; // Nếu không tìm thấy
    }

    private static int solve(String roman) {
        int n = roman.length();
        int result = values[findPos(roman.charAt(n - 1))]; 
        for (int i = n - 1; i > 0; i--) {
            int pos1 = findPos(roman.charAt(i));
            int pos2 = findPos(roman.charAt(i - 1));
            if (values[pos1] <= values[pos2]) {
                result += values[pos2];
            } else {
                result -= values[pos2];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine(); 
        while (t-- > 0) {
            String roman = sc.nextLine();
            System.out.println(solve(roman));
        }
        sc.close();
    }
}
