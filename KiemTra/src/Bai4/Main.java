/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 *
 * @author Hoang Van Khoi
 */
class PTGT {
    private String ma;
    private String hang;
    private String ngayLanBanh;
    private double giaBan;
    private static int sMa = 1;

//    // Constructor
//    public PTGT(String hang, String ngayLanBanh, double giaBan) {
//        this.hang = hang;
//        this.ngayLanBanh = ngayLanBanh;
//        this.giaBan = giaBan;
//        this.ma = generateMa(hang);
//    }
//
//    private String generateMa(String hang) {
//        String code = hang.substring(0, 1).toUpperCase() + String.format("%03d", sMa);
//        sMa++;
//        return code;
//    }
//
//    public double getGiaBan() {
//        return giaBan;
//    }
//
//    public int getNamLanBanh() {
//        String x = ngayLanBanh;
//        return Integer.parseInt(x.substring(x.length() - 4, x.length()));
//    }
//
//    @Override
//    public String toString() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        return ma + " " + hang + " " + dateFormat.format(ngayLanBanh) + " " + giaBan;
//    }
}

class XeTai extends PTGT{
    private double trongtai;
    private boolean thung;

    public void nhap
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PTGT pt=new XeTai();
        ((XeTai)pt).nhap(in);
        System.out.println(pt);
        ((XeTai)pt).nhap(in);
        System.out.println(pt);
    }
}
