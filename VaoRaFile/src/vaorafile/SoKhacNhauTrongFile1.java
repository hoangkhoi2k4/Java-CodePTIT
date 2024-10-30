/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaorafile;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
/**
 *
 * @author Hoang Van Khoi
 */
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> m = new TreeMap<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for(String x : a){
                int num = Integer.parseInt(x);
                if(m.containsKey(num)){
                    m.put(num, m.get(num)+1);
                } else {
                    m.put(num, 1);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
