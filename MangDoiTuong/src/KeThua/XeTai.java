/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua;

/**
 *
 * @author Hoang Van Khoi
 */
public class XeTai extends PTGT {
    private double trongTai;
    private boolean thung;
    private static int soThuTu = 2; 

    public XeTai(String hang, String ngayLanBanh, double giaGoc, double trongTai, boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.trongTai = trongTai;
        this.thung = thung;
    }

    public void setMa() {
        setMa("T-" + String.format("%03d", soThuTu++));
    }

    public double getGiaBan() {
        double giaBan = getGiaGoc();
        int soNam = tinhSoNamLanBanh();

        if (soNam == 0) {
            giaBan += giaBan * 0.1;
        } else if (soNam < 3) {
            giaBan -= giaBan * 0.1;
        } else {
            giaBan -= giaBan * 0.2;
        }

        if (thung) {
            giaBan += giaBan * 0.1;
        }

        return giaBan;
    }

    @Override
    public String toString() {
        return getMa() + " " + getHang() + " " + getNgayLanBanh() + " " + trongTai + " " + (int)getGiaBan();
    }
}


