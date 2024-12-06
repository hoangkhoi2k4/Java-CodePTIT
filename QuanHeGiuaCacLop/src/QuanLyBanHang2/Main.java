/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang2;

/**
 *
 * @author Hoang Van Khoi
 */
import java.util.*;

class KhachHang {
    private static int cnt = 0;
    private String mkh, tenKH, sex, bd, add;

    public KhachHang(Scanner sc) {
        cnt++;
        this.mkh = cnt < 10 ? "KH00" + cnt : "KH0" + cnt;
        this.tenKH = sc.nextLine();
        this.sex = sc.nextLine();
        this.bd = sc.nextLine();
        this.add = sc.nextLine();
    }

    public String getMkh() {
        return mkh;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getAdd() {
        return add;
    }
}

class MatHang {
    private static int cnt = 0;
    private String mmh, tenMH, dvt;
    private long giaMua, giaBan;

    public MatHang(Scanner sc) {
        cnt++;
        this.mmh = cnt < 10 ? "MH00" + cnt : "MH0" + cnt;
        this.tenMH = sc.nextLine();
        this.dvt = sc.nextLine();
        this.giaMua = sc.nextLong();
        this.giaBan = sc.nextLong();
        sc.nextLine(); 
    }

    public String getMmh() {
        return mmh;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDvt() {
        return dvt;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }
}

class HoaDon {
    private static int cnt = 0;
    private String mhd, mkh, mmh;
    private long sl, loiNhuan;

    public HoaDon(Scanner sc) {
        cnt++;
        this.mhd = cnt < 10 ? "HD00" + cnt : "HD0" + cnt;
        this.mkh = sc.next();
        this.mmh = sc.next();
        this.sl = sc.nextLong();
    }

    public String getMhd() {
        return mhd;
    }

    public String getMkh() {
        return mkh;
    }

    public String getMmh() {
        return mmh;
    }

    public long getSl() {
        return sl;
    }

    public long getLoiNhuan() {
        return loiNhuan;
    }

    public void calculateLoiNhuan(Map<String, MatHang> mhMap) {
        MatHang mh = mhMap.get(mmh);
        loiNhuan = mh.getGiaBan() * sl - mh.getGiaMua() * sl;
    }

    public void print(Map<String, KhachHang> khMap, Map<String, MatHang> mhMap) {
        KhachHang kh = khMap.get(mkh);
        MatHang mh = mhMap.get(mmh);
        long total = mh.getGiaBan() * sl;
        System.out.printf("%s %s %s %s %d %d %d\n",
                mhd, kh.getTenKH(), kh.getAdd(),
                mh.getTenMH(),
                sl, total, loiNhuan);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, KhachHang> khMap = new HashMap<>();
        Map<String, MatHang> mhMap = new HashMap<>();

        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            KhachHang kh = new KhachHang(sc);
            khMap.put(kh.getMkh(), kh);
        }

        int M = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < M; i++) {
            MatHang mh = new MatHang(sc);
            mhMap.put(mh.getMmh(), mh);
        }

        int K = sc.nextInt();
        HoaDon[] hoaDons = new HoaDon[K];
        for (int i = 0; i < K; i++) {
            hoaDons[i] = new HoaDon(sc);
        }
        for (HoaDon hd : hoaDons) {
            hd.calculateLoiNhuan(mhMap);
        }

        Arrays.sort(hoaDons, (a, b) -> Long.compare(b.getLoiNhuan(), a.getLoiNhuan()));

        for (HoaDon hd : hoaDons) {
            hd.print(khMap, mhMap);
        }
    }
}
//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4