/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangDiemHocSinh;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, rank;
    private double toan, van, anh, vatli, hoahoc, sinh, lichsu, dia, gdcd, congnghe, tb;
    
    public Student(){
        this.id = this.name = this.rank = "";
        this.toan = this.van = this.anh = this.vatli = this.hoahoc = this.sinh = this.lichsu = this.dia = this.gdcd = this.congnghe = this.tb = 0;
    }
    
    public Student(int id, String name, double toan, double van, double anh, double vatli, double hoahoc, double sinh, double lichsu, double dia, double gdcd, double congnghe){
        String tmp = String.valueOf(id);
        while(tmp.length() < 2){
            tmp = "0" + tmp;
        }
        this.id = "HS" + tmp;
        this.name = name;
        this.toan = toan*2.0;
        this.van = van*2.0;
        this.anh = anh;
        this.vatli = vatli;
        this.hoahoc = hoahoc;
        this.sinh = sinh;
        this.lichsu = lichsu;
        this.dia = dia;
        this.gdcd = gdcd;
        this.congnghe = congnghe;
        this.tb = (toan*2.0 + van*2.0 + anh + vatli + hoahoc + sinh + lichsu + dia + gdcd + congnghe)/12d;
        this.tb = Math.round(this.tb * 10d) / 10d;
        if(this.tb < 5){
            this.rank = "YEU";
        } else if(this.tb >= 5 && this.tb < 7){
            this.rank = "TB";
        } else if(this.tb >= 7 && this.tb < 8){
            this.rank = "KHA";
        } else if(this.tb >= 8 && this.tb < 9){
            this.rank = "GIOI";
        } else {
            this.rank = "XUAT SAC";
        }
    }
    public String getId(){
        return this.id;
    }
    public double getDiem(){
        return this.tb;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.1f", this.tb) + " " + this.rank;
    }
}
