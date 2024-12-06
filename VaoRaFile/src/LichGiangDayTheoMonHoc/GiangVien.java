/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LichGiangDayTheoMonHoc;

/**
 *
 * @author Hoang Van Khoi
 */
public class GiangVien {
    private String ma, maMon, thu, kip, hoTen, phong;

    public GiangVien(int ma, String maMon, String thu, String kip, String hoTen, String phong) {
        this.ma = String.format("HP%03d", ma);
        this.maMon = maMon;
        this.thu = thu;
        this.kip = kip;
        this.hoTen = hoTen;
        this.phong = phong;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getKip() {
        return kip;
    }

    
    
    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return   ma + " " + thu + " " + kip + " " + hoTen + " " + phong  ;
    }
    
    
    
}
