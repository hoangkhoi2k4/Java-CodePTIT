/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyKhachSan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList< KhachSan> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            a.add(new KhachSan(sc.next(), sc.next(), Integer.parseInt(sc.next()), Double.parseDouble(sc.nextLine())));
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> b = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            b.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        b.sort((KhachHang x, KhachHang y) -> {
            return Double.compare(y.getSoNgay(), x.getSoNgay());
        });
        
        for(KhachHang x : b){
            KhachSan y = new KhachSan("", "", 0, 0.0);
            for(KhachSan i : a){
                if(x.getMaPh().equals(i.getLoai())){
                    y = i;
                    break;
                }
            }
            double tien = 0;
            long ngay = x.getSoNgay();
            if(ngay == 0){
                ngay = 1;
            }
            
            tien = ngay * y.getDonGia();
            double phi = y.getPhi();
            tien = tien + phi * tien;
            if(ngay < 10){
               
            } else if(ngay < 20){
                tien = (tien) * 98.0 / 100.0;
            } else if(ngay < 30){
                tien = (tien) * 96.0 / 100.0;
            } else{
                tien = (tien) * 94.0 / 100.0;
            }
            
            
            
            System.out.println(x.getMaKH() + " " + x.getTen() + " " + x.getIdPhong()+ " " + x.getSoNgay() + " " + String.format("%.2f", tien));
        }
    }
}
