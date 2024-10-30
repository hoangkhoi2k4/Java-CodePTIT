/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class DayConTangDan {
    public static ArrayList<String> a = new ArrayList<>();
    public static int[] x = new int[22];
    public static int n;
    public static ArrayList<Integer> tmp = new ArrayList<>();
//    public static String res = "";
    
    public static void xuly(){
        String res = "";
        for(Integer i : tmp){
            res += String.valueOf(i) + " ";
        }
        a.add(res);
    }
    
    public static void Try(int i){
        for(int j = i + 1; j <= n; j++){
            if(x[j] > x[i]){
                tmp.add(x[j]);
                if(tmp.size() > 1) xuly();
                Try(j);
                tmp.remove(tmp.size()- 1);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            x[i] = sc.nextInt();
        }
        Try(0);
        Collections.sort(a, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                return str1.compareTo(str2);
            }
        });
        for(String h : a){
            System.out.println(h);
        }
    }
}
