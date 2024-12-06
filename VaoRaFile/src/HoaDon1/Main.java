/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */

class SanPham{
    private String maSP, tenSP;
    private int donGia1, donGia2;

    public SanPham(String maSP, String tenSP, int donGia1, int donGia2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getDonGia1() {
        return donGia1;
    }

    public int getDonGia2() {
        return donGia2;
    }

    public String getTenSP() {
        return tenSP;
    }
    
    
}

class HoaDon {
    private String maHD, loai;
    private int soLuongMua;
    private SanPham a;

    public HoaDon(String maHD, int soLuongMua, int stt, SanPham x) {
        this.maHD = maHD + "-" +  String.format("%03d", stt);
        String tmp = "";
        tmp += maHD.charAt(maHD.length() - 1);
        loai = tmp;
        this.soLuongMua = soLuongMua;
        this.a = x;
    }
    
     public int thanhTien() {
        if (loai.equals("1")) {
            return a.getDonGia1() * soLuongMua;
        } else {
            return a.getDonGia2() * soLuongMua;
        }
    }
    
    public int giamGia() {
        int thanhTien = thanhTien();
        if (soLuongMua >= 150) {
            return thanhTien / 2;  
        } else if (soLuongMua >= 100) {
            return (int) (thanhTien * 0.3);  
        } else if (soLuongMua >= 50) {
            return (int) (thanhTien * 0.15);  
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return maHD + " " + a.getTenSP() + " " + giamGia() + " " + (thanhTien() - giamGia());
    }
    
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        ArrayList<SanPham> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            a.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        sc.close();
        sc = new Scanner(new File("DATA2.in"));
        ArrayList<HoaDon> b = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String in = sc.nextLine().trim();
            String[] w= in.split("\\s+");
            String maHD = w[0], soLuong = w[1];
            String key = maHD.substring(0, maHD.length() - 1);
            for(SanPham x : a){
                if(x.getMaSP().equals(key)){
                    b.add(new HoaDon(maHD, Integer.parseInt(soLuong), i, x));
                    break;
                }
            }
        }
        sc.close();
        for(HoaDon x : b){
            System.out.println(x);
        }
    }
}
