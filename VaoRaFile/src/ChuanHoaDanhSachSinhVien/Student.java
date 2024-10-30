/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuanHoaDanhSachSinhVien;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, classRoom, date;
    private double GPA;

    public Student(int id, String name, String classRoom, String date, double GPA) {
        this.id = String.format("B20DCCN%03d", id);
        String[] words = name.trim().split("\\s+");
        String res = "";
        for(String x :  words){
            res += x.substring(0, 1).toUpperCase() +  x.substring(1).toLowerCase() + " ";
        }
        this.name = res.trim();
        this.classRoom = classRoom;
        String tmp  = "";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date d = formatter.parse(date);
            tmp = formatter.format(d);
        } catch (ParseException e){
            System.out.println(e);
        }
        this.date = tmp;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classRoom + " " + date + " " + String.format("%.2f",GPA);
    }
    
    
}
