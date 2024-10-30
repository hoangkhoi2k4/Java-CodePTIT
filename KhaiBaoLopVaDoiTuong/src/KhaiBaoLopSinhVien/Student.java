/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopSinhVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, lop, date;
    private float diem;
    
    
    public Student(String name, String lop, String date, float diem){
        this.id = "B20DCCN001";
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.diem = diem;
    }
    public Student(){
        this.id = "B20DCCN001";
        this.name = this.lop = this.date = "";
        this.diem = 0;
    }
    public String formatDob() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(this.date);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + formatDob() + " " + String.format("%.2f", diem);
    }
}
