/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiToanTinhCong;
import java.util.Scanner;
/**
 *
 * @author Hoang Van Khoi
 */
public class NhanVien {
    private String name, id, chuc;
    private long luong, luongcb, thuong, pc, thunhap, ngay;
    private double a, b;
    public NhanVien(){}
    public void input(Scanner sc){
        this.id = "NV01";
        this.name = "";
        String s = sc.nextLine();
        s = s.trim();
        String[] a = s.split("\\s+");
        for(String x :  a){
            this.name =this.name + x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name = this.name.trim();
        this.luongcb = sc.nextLong();
        this.ngay = sc.nextLong();
        sc.nextLine();
        this.chuc = sc.nextLine();
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
        this.a = this.pc;
        this.b = this.thunhap;
    }
    
    @Override 
    public String toString(){
        return this.name + " " + this.luong  + " " + String.format("%.1f",this.a) + " " + String.format("%.1f",this.b);
    }
}
