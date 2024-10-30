/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepNhanVienTheoThuNhap;

/**
 *
 * @author Hoang Van Khoi
 */
public class Employee {
    private String id, name, chuc;
    private double luongcb, cong, phucap, luong, tamung;
    
    public Employee(){}
    public Employee(int id, String name, String chuc, double luongcb, double cong){
        String tmp = String.valueOf(id);
        while(tmp.length() < 2){
            tmp = "0" + tmp;
        }
        this.id = "NV" + tmp;
        
        this.name = name;
        this.chuc = chuc;
        this.luongcb = luongcb;
        this.cong = cong;
        this.luong = this.luongcb*this.cong;
        switch (this.chuc.charAt(0)) {
            case 'G':
                this.phucap = 500;
                break;
            case 'P':
                this.phucap = 400;
                break;
            case 'T':
                this.phucap = 300;
                break;
            case 'K':
                this.phucap = 250;
                break;
            default:
                this.phucap = 100;
                break;
        }        
        if((this.phucap + this.luong)* 2/3 < 25000){
            this.tamung = Math.round((this.phucap + this.luong) * 2/3 / 1000) * 1000;
        } else {
            this.tamung = 25000;
        }
    }
    public double getThuNhap(){
        return (this.luong + this.phucap);
    }
    @Override 
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.0f", this.phucap) + " " + String.format("%.0f", this.luong) + " " + String.format("%.0f", this.tamung) + " " + String.format("%.0f", (this.luong - this.tamung + this.phucap));
    }
}

