/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoNguyenToTrongFileNhiPhan;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n) ;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList)sc.readObject();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(Integer a : arr){
            if(isPrime(a)){
                m.put(a, m.getOrDefault(a, 0) + 1);
            }
        }
        
        for(Map.Entry e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
