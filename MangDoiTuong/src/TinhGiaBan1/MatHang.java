/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGiaBan1;

/**
 *
 * @author Hoang Van Khoi
 */
public class MatHang {
    private String maMH, tenMH, donVi;
    private int giaNhap, soLuong;

    public MatHang() {
    }

    public MatHang(String maMH, String tenMH, String donVi, int giaNhap, int soLuong) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }

    public int phiVanChuyen() {
        return (int) Math.round((this.giaNhap * this.soLuong) * 0.05);
    }

    public int thanhTien() {
        return this.giaNhap * soLuong + phiVanChuyen();
    }

    public int giaBan() {
        return (int) Math.round(thanhTien() + 0.02 * thanhTien());
    }

    public String toString() {
        return this.maMH + " " + this.tenMH + " " + this.donVi + " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
    }
    
    
}
