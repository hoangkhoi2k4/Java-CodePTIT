/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SachGiaoKhoa;

/**
 *
 * @author Hoang Van Khoi
 */
import java.util.Scanner;

public class SachGiaoKhoa extends Sach implements ISach {
    private boolean dungChung;

    public SachGiaoKhoa() {
    }

    public void nhap(Scanner in) {
        
        this.setTen(in.nextLine());
        this.setNhaXB(in.nextLine());
        String x = this.getNhaXB();
        String[] w = x.trim().split("\\s+");
        String res = "";
        for(String a : w){
            res += a.substring(0, 1).toUpperCase();
        }
        this.ma = res + String.format("%03d", sMa++);
        this.gia = Double.parseDouble(in.nextLine());
        this.dungChung = in.nextBoolean();
        in.nextLine(); 
    }

    @Override
    public double getGiaBan() {
        if (getNhaXB().equalsIgnoreCase("giao duc")) {
            if (dungChung) {
                return Math.round(Math.round(gia * 0.95)* 0.9);
            } else {
                return Math.round(gia * 0.95);
            }
        }
        return Math.round(gia);
    }

    @Override
    public String toString() {
        String dungChungStr = dungChung ? "Dung chung sgk" : "khong";
        return ma + " " + getTen() + " " + getNhaXB() + " " + dungChungStr + " " + (int) getGiaBan();
    }
}
