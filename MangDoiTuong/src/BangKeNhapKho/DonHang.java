/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangKeNhapKho;

import java.util.HashMap;

/**
 *
 * @author Hoang Van Khoi
 */
public class DonHang {
    private String ma, ten;
    private int soLuong, donGia, thanhTien, chietKhau;
    private static HashMap<String, Integer> m = new HashMap<>();

    public DonHang( String ten, int soLuong, int donGia) {
        String prefix = "";
        String[] w = ten.toUpperCase().split("\\s+");
        int cnt = 0;
        for(String x : w){
           
            if(cnt == 2){
                break;
            }
            prefix += x.substring(0,1);
            cnt++;
        }
        m.put(prefix, m.getOrDefault(prefix, 0) + 1);
        this.ma = prefix + String.format("%02d", m.get(prefix));
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        
        thanhTien = 0;
        if(soLuong < 5){
            chietKhau = 0;
        } else if(soLuong < 8){
            chietKhau = donGia * soLuong / 100;
        } else if(soLuong <= 10){
            chietKhau = donGia * soLuong / 50;
        } else {
            chietKhau = donGia * soLuong / 20;
        }
        thanhTien = donGia*soLuong - chietKhau;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + chietKhau + " " + thanhTien;
    }
    
    
}
