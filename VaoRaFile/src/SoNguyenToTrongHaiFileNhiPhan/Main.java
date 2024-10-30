/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoNguyenToTrongHaiFileNhiPhan;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    private static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n >= 2;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList)sc.readObject();
        TreeMap<Integer, Integer> m1 = new TreeMap<>(), m2 = new TreeMap<>();
        sc.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA2 .in"));
        ArrayList<Integer> b = (ArrayList)in.readObject();
        in.close();
        for(Integer x : a){
            if(isPrime(x)){
                m1.put(x, m1.getOrDefault(x, 0) + 1);
            }
        }
        for(Integer x : b){
            if(isPrime(x)){
                m2.put(x, m2.getOrDefault(x, 0) + 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> e : m1.entrySet()){
            if(m2.containsKey(e.getKey())){
                System.out.println(e.getKey() + " " + e.getValue() + " " + m2.get(e.getKey()));
            }
        }
    }
}
