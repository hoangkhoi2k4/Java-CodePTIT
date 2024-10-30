/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachDoiTuongNhanVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Employee {
    private String id, name, gt, date, address, maThue, dateSign;
    
    public Employee(int ma, String name, String gt, String date, String address, String maThue, String dateSign){
        this.id = String.valueOf(ma);
        while(this.id.length() < 5){
            this.id = "0" + this.id;
        }
        this.name = name;
        this.gt = gt;
        this.date = date;
        this.address = address;
        this.maThue = maThue;
        this.dateSign = dateSign;
    }
    
    public String getDate(){
        return this.date;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.gt + " " + this.date + " " + this.address + " " + this.maThue + " " + this.dateSign;
    }
}