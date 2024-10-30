/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaorafile;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

/**
 *
 * @author Hoang Van Khoi
 */
public class TinhTong {

    private static int check(String s) {
        long maxValue = Integer.MAX_VALUE;
        long num = 0;  
        int dau = 1; 
        int i = 0;
        if(s.isEmpty()){
            return 0;
        }
        if (s.charAt(0) == '-') {
            dau = -1;
            i = 1;  
        }

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return 0;
            }
            num = num * 10 + (c - '0');  
            if (num > maxValue) {
                return 0;
            }
            i++;
        }
        num = num * dau;

        return (int) num;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));

        long sum = 0;  
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");  

            for (String value : a) {
                sum += check(value);  
            }
        }
        System.out.println(sum); 
    }
}
