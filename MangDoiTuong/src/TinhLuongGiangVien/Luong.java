/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuongGiangVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Luong {
    private String id, name, kk;
    private double heSo;
    private int gio, luong;
    
    public Luong(int id, String name, double heSo, String kk, int gio){
        String tmp = String.valueOf(id);
        while(tmp.length() < 3){
            tmp = "0" + tmp;
        }
        this.id = "PM" + tmp;
        this.name = name;
        this.heSo = heSo;
        this.kk = kk;
        this.gio = gio;
        double tong = this.heSo *3000;
        if(this.kk.equals("A")){
            tong = tong*1.5f;
        } else if(this.kk.equals("B")){
            tong = tong * 1.2f;
        }
        if(this.gio <= 100){
            tong = tong - ((double)tong/100)*(double)15;
        } else if(this.gio < 351){
            tong = tong - tong/10;
        } else if(this.gio < 500){
            tong = tong - tong/20;
        }
        
        this.luong = (int)Math.round(tong);
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.1f", this.heSo) + " " + this.kk + " " + this.gio + " " + this.luong;
    }
}
