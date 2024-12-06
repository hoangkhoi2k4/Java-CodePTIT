/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGioChuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            sc.nextLine();
        }
        sc.close();
        ArrayList<GiangVien> a = new ArrayList<>();
        sc = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String ma = sc.next();
            String name = sc.nextLine().trim();
            a.add(new GiangVien(ma, name));
        }
        sc.close();
        HashMap<String, Double> m = new HashMap<>();
        sc = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String ma = sc.next();
            String maMon = sc.next();
            double x = Double.parseDouble(sc.next());
            if(m.containsKey(ma)){
                m.put(ma, m.get(ma) + x);
            } else {
                m.put(ma, x);
            }
        }
        for(GiangVien x : a){
            System.out.println(x.getTen() + " " + String.format("%.2f", m.get(x.getMa())));
        }
    }
}
