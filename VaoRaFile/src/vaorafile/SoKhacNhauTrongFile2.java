/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaorafile;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.io.FileInputStream;
import java.util.TreeMap;
import java.io.IOException;

/**
 *
 * @author Hoang Van Khoi
 */
public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> m = new TreeMap<>();
        while(sc.available() > 0){
            int x = sc.readInt();
            if(m.containsKey(x)){
                m.put(x, m.get(x)+1);
            } else {
                m.put(x, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
