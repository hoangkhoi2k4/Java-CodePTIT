/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiToanTinhCong;

/**
 *
 * @author Hoang Van Khoi
 */
public class Employee {
    private String name, id, chuc;
    private long luong, luongcb, thuong, pc, thunhap, ngay;
    
    public Employee(String name, long luongcb, long ngay, String chuc){
        this.id = "NV01";
        this.name = name;
        this.chuc = chuc;
        this.luongcb = luongcb;
        this.ngay = ngay;
        this.thuong = 0;
        this.luong = this.ngay*this.luongcb;
        if(ngay >= 25){
            this.thuong = this.luong / 5;
            
        } else if(ngay < 25 && ngay >= 22){
            this.thuong = this.luong / 10;
        }
        
        if(this.chuc.charAt(0) == 'G'){
            this.pc = 250000;
        } else if(this.chuc.charAt(0) == 'P'){
            this.pc = 200000;
        } else if(this.chuc.charAt(0) == 'T'){
            this.pc = 180000;
        } else {
            this.pc = 150000;
        }
        
        this.thunhap = this.luong + this.thuong + this.pc;
    }
    
    @Override 
    public String toString(){
        return this.id + " " + this.name + " " + this.luong + " " + this.thuong + " " + this.pc + " " + this.thunhap;
    }
}
