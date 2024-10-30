/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XetTuyen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, date, xepLoai;
    private double tb, thuong;
    private int tuoi;
    
    public Student(int id, String name, String date, double lt, double th){
        String tmp = String.valueOf(id);
        while(tmp.length() < 2){
            tmp = "0" + tmp;
        }
        this.id = "PH" + tmp;
        name = name.trim();
        String[] words = name.split("\\s+");
        this.name = "";
        for(String x : words){
            this.name += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() +  " ";
        }
        this.name = this.name.trim();
        try{
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            Date da = d.parse(date);
            this.date = d.format(da);
        } catch (Exception e){
            
        }
        this.tuoi = 2021 - Integer.parseInt(this.date.substring(6));
        this.tb = (lt + th)/2;
        if(lt >= 8 && th >= 8){
            thuong = 1;
        } else if(lt >= 7.5 && th >= 7.5){
            thuong = 0.5;
        } else {
            thuong = 0;
        }
        int x = (int)Math.round(tb + thuong);
        if(x > 10) x = 10;
        if(x < 5){
            xepLoai = "Truot";
        } else if(x < 7){
            xepLoai  = "Trung binh";
        } else if(x == 7){
            xepLoai = "Kha";
        } else if(x == 8){
            xepLoai = "Gioi";
        } else if(x == 9 || x == 10 ) {
            xepLoai = "Xuat sac";
        }
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.tuoi + " " + Math.round(tb + thuong) +  " " + xepLoai;
    }
}
