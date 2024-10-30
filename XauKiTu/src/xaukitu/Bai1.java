/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Hoang Van Khoi
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int maxLength = 0;
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] x = s.split("\\s+");
            for(String a : x){
                arr.add(a);
                maxLength = Math.max(a.length(), maxLength);
            }
        }
        for(String x : arr){
            if(x.length() == maxLength){
                System.out.println(x + " - " + maxLength);
                break;
            }
        }
    }
}
