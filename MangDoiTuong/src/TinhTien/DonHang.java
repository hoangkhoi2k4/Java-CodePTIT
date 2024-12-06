/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTien;

/**
 *
 * @author Hoang Van Khoi
 */
public class DonHang {
    private String ma, ten;
    private long soLuong, donGia, tienChietKhau, tong;

    public DonHang(String ma, String ten, long soLuong, long donGia, long tienChietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tienChietKhau = tienChietKhau;
        tong = donGia * soLuong - tienChietKhau;
    }

    public long getTong() {
        return tong;
    }
    

    @Override
    public String toString() {
        return   ma + " " + ten + " " + soLuong + " " + donGia + " " + tienChietKhau + " " + tong ;
    }
            
}
