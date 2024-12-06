/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanGiaBan;

/**
 *
 * @author Hoang Van Khoi
 */
public class DonHang {
    private String ma;
    private double gia;
    private double thue;
    private double phi;

    public DonHang(String ma, int donGia, int soLuong) {
        this.ma = ma; 
        gia = donGia* soLuong;
        thue = 0.0;
        if(ma.charAt(0) == 'T'){
           thue += gia * 0.29;
           phi = gia * 0.04;
        } else if(ma.charAt(0) == 'C'){
            thue += gia * 0.1;
            phi = gia * 0.03;
        } else if(ma.charAt(0) == 'D'){
            thue += gia * 0.08;
            phi = gia * 0.025;
        } else {
            thue += gia * 0.02;
            phi = gia * 0.005;
        }
        
        if(ma.charAt(ma.length() - 1) == 'C'){
            thue -= 0.05*thue;
        }
        
        
        gia = (gia + thue + phi) * 120.0/100.0;
        gia /= 1.0 * soLuong;
    }
    
    

    @Override
    public String toString() {
        return   ma + " " + String.format("%.2f", gia)  ;
    }
    
    
}
