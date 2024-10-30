/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDiemTrungBinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */

class sinhVien {
    private String maSV, hoTen;
    private double mon1, mon2, mon3;
    private int xepHang;

    public sinhVien(String maSV, String hoTen, double mon1, double mon2, double mon3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public void chuanHoa() {
        String[] x = hoTen.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < x.length; i++) {
            res += Character.toUpperCase(x[i].charAt(0));
            for (int j = 1; j < x[i].length(); j++) {
                res += Character.toLowerCase(x[i].charAt(j));
            }
            if (i != x.length - 1) res += " ";
        }
        hoTen = res;
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getMaSV() {
        return maSV;
    }

    public double diemTB() {
        return (this.mon1 * 3 + this.mon2 * 3 + this.mon3 * 2) / 8;
    }

    public String toString() {
        chuanHoa();
        return this.maSV + " " + this.hoTen + " " + String.format("%.2f", diemTB()) + " " + this.xepHang;
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            sinhVien x = new sinhVien("SV" + String.format("%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            sv.add(x);
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if(o1.diemTB()<o2.diemTB()) return 1;
                if(o1.diemTB()>o2.diemTB()) return -1;
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        sv.get(0).setXepHang(1);
        System.out.println(sv.get(0));
        for (int i = 1; i < n; i++) {
            if (sv.get(i).diemTB() == sv.get(i - 1).diemTB())
                sv.get(i).setXepHang(sv.get(i - 1).getXepHang());
            else
                sv.get(i).setXepHang(i + 1);
            System.out.println(sv.get(i));
        }
    }
}
