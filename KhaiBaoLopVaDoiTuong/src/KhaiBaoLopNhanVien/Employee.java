/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopNhanVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Employee {
    private String id,  name, gt, date, address, mathue, dateSign;
    
    public Employee(String name, String gt, String date, String address, String mathue, String dateSign){
        this.id = "00001";
        this.name = name;
        this.gt = gt;
        this.date = date;
        this.address = address;
        this.mathue = mathue;
        this.dateSign = dateSign;
    }
    @Override
    public String toString(){
        return id + " " + this.name + " " + this.gt + " " + this.date + " " + this.address + " " + this.mathue + " " + this.dateSign;
    }
    
}
