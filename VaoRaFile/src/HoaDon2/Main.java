package HoaDon2;

import java.io.*;
import java.util.*;

class KhachHang {
    private static int count = 0; 
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

    public KhachHang(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        count++;
        this.maKH = String.format("KH%03d", count); 
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }
}

class MatHang {
    private static int count = 0;
    private String maMH, tenMH, donViTinh;
    private int giaMua, giaBan;

    public MatHang(String tenMH, String donViTinh, int giaMua, int giaBan) {
        count++;
        this.maMH = String.format("MH%03d", count);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
}

class HoaDon {
    private static int count = 0; 
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(KhachHang khachHang, MatHang matHang, int soLuong) {
        count++;
        this.maHD = String.format("HD%03d", count); 
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        int thanhTien = matHang.getGiaBan() * soLuong;
        return maHD + " " +
                khachHang.getTenKH() + " " +
                khachHang.getDiaChi() + " " +
                matHang.getTenMH() + " " +
                matHang.getDonViTinh() + " " +
                matHang.getGiaMua() + " " +
                matHang.getGiaBan() + " " +
                soLuong + " " +
                thanhTien;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner khScanner = new Scanner(new File("KH.in"));
        Scanner mhScanner = new Scanner(new File("MH.in"));
        Scanner hdScanner = new Scanner(new File("HD.in"));

        int n = Integer.parseInt(khScanner.nextLine());
        Map<String, KhachHang> khMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String tenKH = khScanner.nextLine();
            String gioiTinh = khScanner.nextLine();
            String ngaySinh = khScanner.nextLine();
            String diaChi = khScanner.nextLine();
            KhachHang kh = new KhachHang(tenKH, gioiTinh, ngaySinh, diaChi);
            khMap.put(kh.getMaKH(), kh);
        }

        int m = Integer.parseInt(mhScanner.nextLine());
        Map<String, MatHang> mhMap = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            String tenMH = mhScanner.nextLine();
            String donViTinh = mhScanner.nextLine();
            int giaMua = Integer.parseInt(mhScanner.nextLine());
            int giaBan = Integer.parseInt(mhScanner.nextLine());
            MatHang mh = new MatHang(tenMH, donViTinh, giaMua, giaBan);
            mhMap.put(mh.getMaMH(), mh);
        }

        int k = Integer.parseInt(hdScanner.nextLine());
        List<HoaDon> hoaDonList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String[] parts = hdScanner.nextLine().split(" ");
            KhachHang kh = khMap.get(parts[0]);
            MatHang mh = mhMap.get(parts[1]);
            int soLuong = Integer.parseInt(parts[2]);
            hoaDonList.add(new HoaDon(kh, mh, soLuong));
        }

        for (HoaDon hd : hoaDonList) {
            System.out.println(hd);
        }
    }
}

