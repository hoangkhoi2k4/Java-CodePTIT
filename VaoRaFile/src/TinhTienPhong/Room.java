/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienPhong;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Hoang Van Khoi
 */
public class Room implements Comparable<Room>{
    private String id, name, soPhong;
    private Date nhan, tra;
    private long phatSinh, ngay, tong;

    public Room(int id, String name,String soPhong, String nhan, String tra, long phatSinh) {
        this.id = String.format("KH%02d", id);
        name = name.trim();
        String[] w = name.split("\\s+");
        String tmp  = "";
        for(String x : w){
            tmp += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name = tmp.trim();
        this.soPhong = soPhong;
        try{
            SimpleDateFormat fo = new SimpleDateFormat("dd/MM/yyyy");
            
            this.nhan = fo.parse(nhan);
            this.tra = fo.parse(tra);
            
            long differenceInMillis = Math.abs(this.tra.getTime() - this.nhan.getTime());
            long differenceInDays = TimeUnit.DAYS.convert(differenceInMillis, TimeUnit.MILLISECONDS);
            this.ngay = differenceInDays + 1;
        } catch (Exception e){
            System.out.println("Lỗi " + e.getMessage());
        }
        
        this.phatSinh = phatSinh;
        if(soPhong.charAt(0) == '1'){
            tong = 25*this.ngay;
        } else if(soPhong.charAt(0) == '2'){
            tong = 34*this.ngay;
        } else if(soPhong.charAt(0) == '3'){
            tong = 50*this.ngay;
        } else {
            tong = 80*this.ngay;
        }
        tong = tong + this.phatSinh;
    }

    @Override
    public int compareTo(Room o) {
        return Long.compare(o.tong, this.tong);
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + soPhong + " "  + ngay + " " + tong;
    }
    
    
}
