/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangThuNhapGiaoVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class GiaoVien {
    private String ma;
    private String ten;
    private int luongcb;

    public GiaoVien(String ma, String ten, int luongcb) {
        this.ma = ma;
        this.ten = ten;
        this.luongcb = luongcb;
    }
    
    public int tinhBacLuong(){
        return Integer.parseInt(ma.substring(ma.length() - 2, ma.length()));
    }
    
    public int tinhPhuCap(){
        if(ma.substring(0, 2).equals("HT")){
            return 2000000;
        } else if(ma.substring(0, 2).equals("HP")){
            return 900000;
        } else{
            return 500000;
        }
    }
    
    public int tinhThuNhap(){
        return (tinhPhuCap() + tinhBacLuong() * luongcb);
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + tinhBacLuong() + " " + tinhPhuCap() + " " + tinhThuNhap();
    }
    
    
}
