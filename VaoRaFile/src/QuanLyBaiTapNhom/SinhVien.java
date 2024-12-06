/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBaiTapNhom;

/**
 *
 * @author Hoang Van Khoi
 */
public class SinhVien {
    private String ma;
    private String ten;
    private String sdt;
    private int nhom;

    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public String getMa() {
        return ma;
    }

    public int getNhom() {
        return nhom;
    }
    
    

    @Override
    public String toString() {
        return  ma + " " + ten + " " + sdt + " " + nhom;
    }
    
    
}
