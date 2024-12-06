/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyPhongThucHanh;
import java.io.Serializable;

/**
 *
 * @author Hoang Van Khoi
 */
public class Phong implements Serializable{
    private String ma, tenPhong;
    private int soLuong;
    private String kieuPhong;

    public Phong() {
    }

    public Phong(String ma, String tenPhong, int soLuong, String kieuPhong) {
        this.ma = ma;
        this.tenPhong = tenPhong;
        this.soLuong = soLuong;
        this.kieuPhong = kieuPhong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getKieuPhong() {
        return kieuPhong;
    }

    public void setKieuPhong(String kieuPhong) {
        this.kieuPhong = kieuPhong;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, tenPhong, soLuong, kieuPhong
        };
    }
}
