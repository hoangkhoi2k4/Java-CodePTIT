/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlan1;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList)sc.readObject();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(Integer x : arr){
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
