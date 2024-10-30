/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tong2DaThuc;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Hoang Van Khoi
 */
public class DaThuc {
    
    private TreeMap<Integer, Integer> poly = new TreeMap<>(Collections.reverseOrder());

    public DaThuc(String s) {
        s = s.replaceAll("\\s+", ""); 
        Pattern p = Pattern.compile("([+-]?\\d+)\\*x\\^(\\d+)");
        Matcher m = p.matcher(s);
        while (m.find()) {
            int heso = Integer.parseInt(m.group(1));
            int mu = Integer.parseInt(m.group(2));
            poly.put(mu, poly.getOrDefault(mu, 0) + heso);
        }
    }

    public DaThuc cong(DaThuc other) {
        DaThuc res = new DaThuc("");  
        for (Map.Entry<Integer, Integer> entry : this.poly.entrySet()) {
            res.poly.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry : other.poly.entrySet()) {
            res.poly.put(entry.getKey(), res.poly.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        
        return res;  
    }

    public void out() {
        boolean first = true; 
        for (Map.Entry<Integer, Integer> entry : poly.entrySet()) {
            int heso = entry.getValue();
            int mu = entry.getKey();
            
            if (heso == 0) continue;  
            
            if (!first && heso > 0) {
                System.out.print(" + ");  
            } else if (heso < 0) {
                System.out.print(" - ");
                heso = -heso; 
            }
            
            System.out.print(heso + "*x^" + mu);
            first = false; 
        }
        System.out.println(); 
    }
}
