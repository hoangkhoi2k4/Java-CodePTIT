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
public class LoaiBoSoNguyen {
    private static boolean check(String s) {
        long maxValue = Integer.MAX_VALUE;
        long num = 0;  
        int dau = 1; 
        int i = 0;
        if(s.isEmpty()){
            return false;
        }
        if (s.charAt(0) == '-') {
            dau = -1;
            i = 1;  
        }

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return true;
            }
            num = num * 10 + (c - '0');  
            if (num > maxValue) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");  

            for (String value : a) {
                if(check(value)){
                    arr.add(value);
                }
            }
        }
        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.compareTo(s2);
            }
        });
        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}


