/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraCuuDonHang;

/**
 *
 * @author Hoang Van Khoi
 */
public class DonHang {
    private String ten, ma, Stt;
    private int donGia, soLuong, giamGia, thanhTien;

    public DonHang(String ten, String ma, int donGia, int soLuong) {
        this.ten = ten;
        this.ma = ma;
        this.Stt = ma.substring(1, ma.length() - 1);
        if(ma.charAt(ma.length() - 1) == '1'){
            giamGia = (int)Math.ceil(donGia * soLuong * 0.5);
        } else {
            giamGia = (int)Math.ceil(donGia * soLuong * 0.3);
        }
        this.donGia = donGia;
        this.soLuong = soLuong;
        thanhTien = donGia * soLuong - giamGia;
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + Stt + " " + giamGia + " " + thanhTien  ;
    }
    
    

}
