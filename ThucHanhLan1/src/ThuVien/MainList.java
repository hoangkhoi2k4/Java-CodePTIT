/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class MainList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLTV q = new QLTV();
        q.nhapSach(in);
        q.nhapTapChi(in);
        q.out();
        q.xoa1("S1222");
        q.xoa1("S123");
        q.suaMa("TL10000");
        q.suaMa("S123");
        
    }
}

class QLTV implements ChucNang{
    private List<TaiLieu> a;

    public QLTV() {
        a = new ArrayList<>();
        
    }

    public List<TaiLieu> getLisr() {
        return a;
    }

    public void setList(List<TaiLieu> a) {
        this.a = a;
    }
    
    public TaiLieu getTLByMa(String ma){
        for(TaiLieu i : a){
            if(i.getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return null;
    }
    
    private TaiLieu Nhap(Scanner in){
        String ma;
        while(true){
            ma = in.nextLine();
            if(getTLByMa(ma) == null){
                break;
            }
            System.err.println("Nhap lai ma");
        }
        String tenNXB = in.nextLine();
        int so = Integer.parseInt(in.nextLine());
        return null;
    }
    @Override
    public void nhapSach(Scanner in) {
//        TaiLieu t = nhap(in);
//        String tenS = 
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nhapTapChi(Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void out() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoa1(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoaNhieu(String tenTG) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void suaMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

interface ChucNang{

    public void nhapSach(Scanner in);
    public void nhapTapChi(Scanner in);
    public void out();
    public void xoa1(String ma);
    public void xoaNhieu(String tenTG); // xoa tren tap Sach
    public void suaMa(String ma); // xoa tren tap Sach
    
}
class TaiLieu{
    private String ma, tenNXB;

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }
    private int soBanPH;
    
    public TaiLieu(){
        
    }

    public TaiLieu(String ma, String tenNXB, int soBanPH) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    
}

class Sach extends TaiLieu{
    private String tenSach, tenTG;
    private int soTrang;
    public Sach(String tenSach, String tenTG, int soTrang) {
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }
    
    public Sach(){
        
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    public String toString(){
        return getMa() + " " + getTenNXB() + " " + getSoBanPH() + " " + tenSach + " " + tenTG + " " + soTrang;
    }
    
    
}

class TapChi extends TaiLieu{
    private int thang, soPH;
    
    public TapChi(){
        
    }

    public TapChi(int thang, int soPH, String ma, String tenNXB) {
        super(ma, tenNXB, soPH);
        this.thang = thang;
        this.soPH = soPH;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }
    public String toString(){
        return getMa() + " " + getTenNXB() + " " + getSoBanPH() + " " + thang + " " + soPH ;
    }
    
}
