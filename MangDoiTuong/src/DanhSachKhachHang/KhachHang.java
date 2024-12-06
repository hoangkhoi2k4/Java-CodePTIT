/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Van Khoi
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, gt, ngaySinh, diaChi;

    public KhachHang(int ma, String ten, String gt, String ngaySinh, String diaChi) throws ParseException {
        this.ma = String.format("KH%03d", ma);
        String[] w = ten.trim().split("\\s+");
        String name =  "";
        for(String x : w){
            name += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.ten = name.trim();
        this.gt = gt;
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        
        String a = d.format(d.parse(ngaySinh));
        this.ngaySinh = a;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + gt  + " " + diaChi + " " + ngaySinh ;
    }

    @Override
    public int compareTo(KhachHang o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = sdf.parse(this.ngaySinh);
            Date date2 = sdf.parse(o.ngaySinh);
            return date1.compareTo(date2);
        } catch (ParseException ex) {
            Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
}
