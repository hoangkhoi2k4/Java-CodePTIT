/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimThuKhoaKyThi;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String name, date;
    private int id;
    private double tong;
    
    public Student(int id, String name, String date, double mon1, double mon2, double mon3){
        this.id = id;
        this.name = name;
        this.date = date;
        this.tong = mon1 + mon2 + mon3;
    }
    
    public double getTong(){
        return this.tong;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.date + " " + String.format("%.1f", this.tong);
    }
}
