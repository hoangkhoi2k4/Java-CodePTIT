/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyKhachSan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Hoang Van Khoi
 */
public class KhachHang {
    private String maKH, ten, maPh;
    private long soNgay;

    public KhachHang(int maKH, String ten, String maPh, String ngayDen, String ngayDi) {
        this.maKH = String.format("KH%02d", maKH);
        this.ten = ten;
        this.maPh = maPh;
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate start = LocalDate.parse(ngayDen, fo);
        LocalDate end = LocalDate.parse(ngayDi, fo);
        
        soNgay = ChronoUnit.DAYS.between(start, end);
        
    }

    public String getMaKH() {
        return maKH;
    }

    public String getMaPh() {
        return maPh.substring(2, 3);
    }
    
    public String getIdPhong(){
        return maPh;
    }

    public long getSoNgay() {
        return soNgay;
    }

    public String getTen() {
        return ten;
    }
    
    
}
