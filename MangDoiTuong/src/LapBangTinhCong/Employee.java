/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapBangTinhCong;

/**
 *
 * @author Hoang Van Khoi
 */
public class Employee {
    private String name, id, chuc;
    private long luong, luongcb, thuong, pc, thunhap, ngay;
    
    public Employee(int id, String name, long luongcb, long ngay, String chuc){
        String tmp = String.valueOf(id);
        while(tmp.length() < 2){
            tmp = "0" + tmp;
        }
        this.id = "NV" + tmp;
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
        switch (this.chuc.charAt(0)) {
            case 'G':
                this.pc = 250000;
                break;
            case 'P':
                this.pc = 200000;
                break;
            case 'T':
                this.pc = 180000;
                break;
            default:
                this.pc = 150000;
                break;
        }
        
        this.thunhap = this.luong + this.thuong + this.pc;
    }
    public long getThuNhap(){
        return this.thunhap;
    }
    @Override 
    public String toString(){
        return this.id + " " + this.name + " " + this.luong + " " + this.thuong + " " + this.pc + " " + this.thunhap;
    }
}
