/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoThuanNghichTrongFile;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static boolean check(int n){
        String num = String.valueOf(n);
        if(num.length() < 2) return false;
        int len = num.length();
        if(len % 2 == 0) return false;
        for(int i = 0; i <= len/2; i++){
            if(num.charAt(i) != num.charAt(len - i - 1) || (num.charAt(i) - '0') % 2 == 0 ){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws Exception {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList)sc.readObject();
        
        TreeMap<Integer, Integer> m = new TreeMap<>(); 
        sc.close();
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList)in.readObject();
        in.close();
        Set<Integer> bSet = new HashSet<>(b);
        
        for (Integer x : a) {
            if (check(x) && bSet.contains(x)) {
                m.put(x, m.getOrDefault(x, 0) + 1);  
            }
        }
        
       
        for (Integer x : b) {
            if (check(x) && m.containsKey(x)) {
                m.put(x, m.get(x) + 1);  
            }
        }
        

        int cnt = 0;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (cnt >= 10) break;  
            System.out.println(e.getKey() + " " + e.getValue());
            cnt++;
        }
        
    }
}
