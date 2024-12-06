/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGioChuanChoTungGiangVien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Hoang Van Khoi
 */
class Mon{
    private String maMon, ten;

    public Mon(String maMon, String ten) {
        this.maMon = maMon;
        this.ten = ten;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTen() {
        return ten;
    }
    
    
}

class GiaoVien{
    private String maGV, ten;

    public GiaoVien(String maGV, String ten) {
        this.maGV = maGV;
        this.ten = ten;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTen() {
        return ten;
    }

    
    
}

class Bang{
    private String maGV, maMon;
    private float time;

    public Bang(Scanner sc) {
        maGV = sc.next();
        maMon = sc.next();
        time = sc.nextFloat();
    }

    public String getMaGV() {
        return maGV;
    }

    public String getMaMon() {
        return maMon;
    }

    public float getTime() {
        return time;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Mon> dsm = new TreeMap<>();
        TreeMap<String, GiaoVien> dsgv = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            String ma = sc.next();
            String ten = sc.nextLine().trim();
            
            Mon a = new Mon(ma, ten);
            dsm.put(a.getMaMon(), a);
        }
        
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++){
            String ma = sc.next();
            String ten = sc.nextLine().trim();
            
            GiaoVien a = new GiaoVien(ma, ten);
            dsgv.put(a.getMaGV(), a);
        }
        
        int k = sc.nextInt();
        Bang[] dsb = new Bang[k];
        for(int i = 0; i < k; i++){
            dsb[i] = new Bang(sc);
        }
        
        String ma = sc.next();
        System.out.println("Giang vien: " + dsgv.get(ma).getTen());
        HashMap<String, Float> mon = new HashMap<>();
        float tong = 0;
        for(int i = 0; i < k; i++){
            if(ma.equals(dsb[i].getMaGV())){
                String x = dsb[i].getMaMon();
                mon.put(x, dsb[i].getTime());
                tong += dsb[i].getTime();
            }
        }
        
        for (Map.Entry<String, Float> e : mon.entrySet()) {
            System.out.println(dsm.get(e.getKey()).getTen() + " " + e.getValue());
        }
        System.out.println("Tong: " + String.format("%.2f", tong));
    }
}
//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01