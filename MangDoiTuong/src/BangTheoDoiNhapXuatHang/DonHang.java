/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangTheoDoiNhapXuatHang;

/**
 *
 * @author Hoang Van Khoi
 */
public class DonHang {
    private String ma;
    private long nhap, xuat, donGia, tien, thue;

    public DonHang(String ma, long nhap) {
        this.ma = ma;
        this.nhap = nhap;
        
        if(ma.charAt(0) == 'A'){
            xuat = Math.round(nhap * 0.6);
        } else {
            xuat = Math.round(nhap * 0.7);
        }
        
        if(ma.charAt(ma.length() - 1) == 'Y'){
            donGia = 110000;
        } else {
            donGia = 135000;
        }
        
        tien = xuat * donGia;
        if(ma.charAt(0) == 'A' && ma.charAt(ma.length() - 1) == 'Y'){
            thue = Math.round(tien * 0.08);
        } else if(ma.charAt(0) == 'A' && ma.charAt(ma.length() - 1) == 'N'){
            thue = Math.round(tien * 0.11);
        } else if(ma.charAt(0) == 'B' && ma.charAt(ma.length() - 1) == 'Y'){
            thue = Math.round(tien * 0.17);
        } else {
            thue = Math.round(tien * 0.22);
        }
    }

    @Override
    public String toString() {
        return ma + " " + nhap + " " + xuat + " " + donGia + " " + tien + " " + thue ;
    }
    
    
    
}
