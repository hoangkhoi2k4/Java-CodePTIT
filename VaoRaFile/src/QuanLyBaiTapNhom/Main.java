/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBaiTapNhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        HashMap<Integer, String> m = new HashMap<>();
        sc = new Scanner(new File("BAITAP.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            m.put(i, sc.nextLine());
        }
        sc.close();
        sc = new Scanner(new File("NHOM.in"));
        while(sc.hasNext()){
            String ma = sc.next();
            int nhom = sc.nextInt();
            
            for(SinhVien x : a){
                if(x.getMa().equals(ma)){
                    x.setNhom(nhom);
                    break;
                }
            }
        }
        sc.close();
        a.sort((SinhVien x, SinhVien y) -> {
            return x.getMa().compareTo(y.getMa());
        });
        for(SinhVien x : a){
            System.out.println(x + " " + m.get(x.getNhom()));
        }
        
    }
}
