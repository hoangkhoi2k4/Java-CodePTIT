/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetQuaTuyenSinh;

/**
 *
 * @author Hoang Van Khoi
 */
public class ThiSinh {
    private String ma, ten;
    private int tuoi;
    private double diemtb;
    private String xepLoai;

    public ThiSinh(int ma, String ten, String ngaySinh, double lt, double th) {
        this.ma = String.format("PH%02d", ma);
        this.ten = ten;
        tuoi = 2021 - Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4, ngaySinh.length()));
        diemtb = (lt + th)/2;
        if(lt >= 8 && th >= 8){
            diemtb += 1;
        } else if(lt >= 7.5 && th >= 7.5){
            diemtb += 0.5;
        } else {
            
        }
        if(diemtb > 10){
            diemtb = 10;
        }
        
        if(Math.round(diemtb) < 5){
            xepLoai = "Truot";
        } else if(Math.round(diemtb) < 7){
            xepLoai = "Trung binh";
        } else if(Math.round(diemtb) == 7){
            xepLoai = "Kha";
        } else if(Math.round(diemtb) == 8){
            xepLoai = "Gioi";
        } else if(Math.round(diemtb) == 9 || Math.round(diemtb) == 10){
            xepLoai = "Xuat sac";
        }
    }

    @Override
    public String toString() {
        return   ma + " " + ten + " " + tuoi + " " + Math.round(diemtb) + " " + xepLoai ;
    }
    
    
}
