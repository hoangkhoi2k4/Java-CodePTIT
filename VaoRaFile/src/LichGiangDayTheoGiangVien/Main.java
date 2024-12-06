/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LichGiangDayTheoGiangVien;

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
        HashMap<String, String> m = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String x = sc.nextLine().trim();
            String y = sc.nextLine().trim();
            m.put(x, y);
            sc.nextLine();
        }
        sc.close();
        sc = new Scanner(new File("LICHGD.in"));
        ArrayList<GiangVien> a = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            a.add(new GiangVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        a.sort((GiangVien x, GiangVien y) -> {
            if(x.getThu().equals(y.getThu())){
                if(x.getKip().equals(y.getKip())){
                   return x.getHoTen().compareTo(y.getHoTen());
                }
                return x.getKip().compareTo(y.getKip());
            }
            return x.getThu().compareTo(y.getThu());    
        });
        
        String ten = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + ten + ":");
        for(GiangVien x : a){
            if(x.getHoTen().equals(ten)){
                System.out.println(x.getMa() + " " + m.get(x.getMaMon()) + " " + x.getThu() + " " + x.getKip() + " " + x.getPhong());
            }
        }
    }
}
