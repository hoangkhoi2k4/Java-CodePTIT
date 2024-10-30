/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepThoiGian;

/**
 *
 * @author Hoang Van Khoi
 */
public class Time {
    private int gio, phut, giay;
    public Time(int gio, int phut, int giay){
        this.gio = gio;
        this.giay = giay;
        this.phut = phut;
    }
    
    public int getGio(){
        return gio;
    }
    public int getGiay(){
        return giay;
    }
    public int getPhut(){
        return phut;
    }
    
    @Override
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
}
