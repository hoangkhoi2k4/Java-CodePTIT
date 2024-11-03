/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
class GiangVien{
    static int i = 1;
    String ma, ten, heso;
    double hesoluong, gio, luonglinh;
    

    public GiangVien( String ten, double hesoluong,String heso, double gio) {
        this.ma = String.format("PM%03d", i++);
        this.ten = ten;
        this.heso = heso;
        this.hesoluong = hesoluong;
        this.gio = gio;
        luonglinh = hesoluong*3000;
        
        if(this.heso.equals("A")){
            luonglinh = luonglinh*150/100;
        } else if(this.heso.equals("B")){
            luonglinh = luonglinh*120/100;
        } else if(this.heso.equals("C")){
            luonglinh = luonglinh;
        }
        
        if(this.gio >= 500){
            
        } else if(this.gio >= 351){
            luonglinh = luonglinh*95/100;
        } else if(this.gio >= 101){
            luonglinh = luonglinh*90/100;
        } else if(this.gio >= 0){
            luonglinh = luonglinh*85/100;
        }
    }

    @Override
    public String toString() {
        return  ma + " " + ten +  " " + hesoluong + " " + heso + " " + (int)gio + " " + round(luonglinh) ;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> arr = new ArrayList<>();
        while(t-- > 0){
            String ten = sc.nextLine();
            double hesoluong = Double.parseDouble(sc.nextLine());
            String heso = sc.nextLine();
            double gio = Double.parseDouble(sc.nextLine());
            arr.add(new GiangVien(ten, hesoluong, heso, gio));
        }
        
        String x= sc.nextLine().toLowerCase();
        for(GiangVien z : arr){
            if(z.ten.toLowerCase().contains(x)){
                System.out.println(z);
            }
        }
    }
}
