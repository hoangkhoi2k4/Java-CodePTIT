/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDiemTrungBinh;


/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, rank;
    private double total;
    private int xepHang;
    
    public Student(int id, String name, double diem1, double diem2, double diem3){
        String tmp = String.valueOf(id);
        while(tmp.length() < 2){
            tmp = "0" + tmp;
        }
        this.id = "SV" + tmp;
        
        name = name.trim();
        String[] words = name.split("\\s+");
        this.name = "";
        for(String x : words){
            this.name += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name = this.name.trim();
        
        total = (diem1 * 3 + diem2 * 3 + diem3 * 2)/8;
        
        if(total >= 8){
            rank = "GIOI";
        } else if(total >= 6.5){
            rank = "KHA";
        } else if(total >= 5){
            rank = "TRUNG BINH";
        } else {
            rank = "KEM";   
        }
    }
    
    public double getTotal(){
        return total;
    }
    
    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + String.format("%.2f",total) + " " + rank + " " + xepHang;
    }
}
