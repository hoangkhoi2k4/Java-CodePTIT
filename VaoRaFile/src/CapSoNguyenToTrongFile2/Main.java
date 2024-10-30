/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapSoNguyenToTrongFile2;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws Exception {
        ObjectInputStream d = new ObjectInputStream(new FileInputStream("DATA1.in"));
        TreeSet<Integer> s1 = new TreeSet<>();
        ArrayList<Integer> a = (ArrayList)d.readObject();
        for(Integer x : a){
            if(isPrime(x)){
                s1.add(x);
            }
        }
        d.close();
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        TreeSet<Integer> s2 = new TreeSet<>();
        ArrayList<Integer> b = (ArrayList)sc.readObject();
        for(Integer x : b){
            if(isPrime(x)){
                s2.add(x);
            }
        }
        sc.close();
        
        final int SUM = 1000000;
        for (Integer x : s1) {
            if (x * 2 >= SUM) {
                break;
            }
            if (s1.contains(SUM - x) && !s2.contains(x) && !s2.contains(SUM - x)) {
                System.out.println(x + " " + (SUM - x));
            }
        }
    }
}
