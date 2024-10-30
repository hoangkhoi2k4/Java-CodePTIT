/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua;

/**
 *
 * @author Hoang Van Khoi
 */
public class Oto extends PTGT {
    private int soCho;
    private double dongCo;
    private static int soThuTu = 1;

    public Oto(String hang, String ngayLanBanh, double giaGoc, int soCho, double dongCo) {
        super(hang, ngayLanBanh, giaGoc);
        this.soCho = soCho;
        this.dongCo = dongCo;
    }

    public void setMa() {
        String hang = getHang().substring(0, 2).toUpperCase();
        setMa(hang + "-" + String.format("%03d", soThuTu++));
    }

    public double getGiaBan() {
        double giaBan = getGiaGoc();
        int soNam = tinhSoNamLanBanh();

        if (soNam == 0) {  
            giaBan += giaBan * 0.1;
        } else if (soNam <= 2) {  
            giaBan -= giaBan * 0.1;
        } else if (soNam <= 5) {  
            giaBan -= giaBan * 0.2;
        } else {  
            giaBan -= giaBan * 0.3;
        }

        return giaBan;
    }

    @Override
    public String toString() {
        return getMa() + " " + getHang() + " " + getNgayLanBanh() + " " + soCho + " " + (int)getGiaBan();
    }
}


