/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hoang Van Khoi
 */
public class SinhVien {
    private String id, name, classRoom, date;
    private double GPA;

    public SinhVien(int id, String name, String classRoom, String date, double GPA) throws ParseException {
        this.id = String.format("B20DCCN%03d", id);
        this.name = name;
        this.classRoom = classRoom;
        SimpleDateFormat fo = new SimpleDateFormat("dd/MM/yyyy");
        Date tmp = fo.parse(date);
        this.date = fo.format(tmp);
        this.date = date;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + classRoom + " " + date + " " + String.format("%.2f", GPA) ;
    }
    
    
}
