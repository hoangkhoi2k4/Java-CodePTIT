/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoiTuongSinhVien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String ma, name, lop, date;
    private double gpa;
    
    public Student(){
        this.ma = this.name = this.lop = this.date;
        this.gpa = 0d;
    }
    
    public Student(int ma, String name, String lop, String date, double gpa){
        this.ma = String.valueOf(ma);
        while(this.ma.length() < 3){
            this.ma = "0" + this.ma;
        }
        this.ma = "B20DCCN" + this.ma;
        name = name.trim();
        String words[] = name.split("\\s+");
        String res = "";
        for(String word : words){
            if(!word.isEmpty()){
                String tmp = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                res += tmp;
                res += " ";
            }
        }
        this.name = res.trim();
        this.lop = lop;
        String tmp = date;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date d = formatter.parse(date);
            tmp = formatter.format(d);
        } catch (ParseException e) {
            System.out.println(e);
        }
        this.date = tmp;
        this.gpa = gpa;
    }
    
    @Override 
    public String toString(){
        return this.ma + " " + this.name + " " + this.lop + " " + this.date + " " + String.format("%.2f", this.gpa);
    }
}