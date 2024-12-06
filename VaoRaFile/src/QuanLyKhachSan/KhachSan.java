/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyKhachSan;

/**
 *
 * @author Hoang Van Khoi
 */
public class KhachSan {
    private String loai, ten;
    private int donGia;
    private double phi;

    public KhachSan(String loai, String ten, int donGia, double phi) {
        this.loai = loai;
        this.ten = ten;
        this.donGia = donGia;
        this.phi = phi;
    }

    public String getLoai() {
        return loai;
    }

    public String getTen() {
        return ten;
    }

    public int getDonGia() {
        return donGia;
    }

    public double getPhi() {
        return phi;
    }
    
    
}
