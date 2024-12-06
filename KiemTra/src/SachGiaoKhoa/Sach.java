/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SachGiaoKhoa;

/**
 *
 * @author Hoang Van Khoi
 */
public class Sach {
    protected String ma;
    private String ten, nhaXB;
    protected double gia;
    protected static int sMa = 1;

    public Sach() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }
}
