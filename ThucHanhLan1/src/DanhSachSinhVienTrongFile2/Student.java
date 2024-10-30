/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSinhVienTrongFile2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name,  date, classRoom;
    private double GPA;
    
    public Student(int id, String name,  String classRoom, String date, double GPA) throws Exception{
        String tmp = String.valueOf(id);
        while(tmp.length() < 3){
            tmp = "0" + tmp;
        }
        this.id = "B20DCCN" + tmp;
        
        this.name = name;
        this.classRoom = classRoom;
        this.date = "";
        try{
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            Date da = d.parse(date);
            this.date = d.format(da);
        } catch (Exception e){
            
        }

        this.GPA = GPA;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.classRoom + " " + this.date + " " + String.format("%.2f", this.GPA);
    }
}
