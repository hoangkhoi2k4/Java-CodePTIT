/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKeTuKhacNhauTrongFileNhiPhan;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> s = (ArrayList)ob.readObject();
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : s) {
            Pattern p = Pattern.compile("[a-z0-9]+");
            Matcher m = p.matcher(x.toLowerCase());
            
            while(m.find()){
                String w = m.group();
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }
        
        ob.close();
        List<Map.Entry<String, Integer>> lis = new ArrayList<>(map.entrySet());
        lis.sort((e1, e2) -> {
            if(!e1.getValue().equals( e2.getValue())){
                return e2.getValue() - e1.getValue();
            }
            return e1.getKey().compareTo(e2.getKey());
        });
        
        for (Map.Entry<String, Integer> e : lis ) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
