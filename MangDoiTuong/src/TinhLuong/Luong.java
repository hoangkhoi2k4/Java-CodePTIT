/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuong;

/**
 *
 * @author Hoang Van Khoi
 */
public class Luong {
    private String ma, ten, phongBan;
    private long luong, heSo;

    public Luong(String ma, String ten, int luongcb, int soNgay, String phongBan) {
        this.ma = ma;
        this.ten = ten;
        this.phongBan = phongBan;
        if(ma.substring(0, 1).equals("A")){
            int x = Integer.parseInt(ma.substring(1, 3));
            if(x >= 1 && x <= 3){
                heSo = 10;
            } else if(x >= 4 && x <= 8){
                heSo = 12   ;
            } else if(x >= 9 && x <= 15){
                heSo = 14;
            } else {
                heSo = 20;
            }
        } else if(ma.substring(0, 1).equals("B")){
            int x = Integer.parseInt(ma.substring(1, 3));
            if(x >= 1 && x <= 3){
                heSo = 10;
            } else if(x >= 4 && x <= 8){
                heSo = 11   ;
            } else if(x >= 9 && x <= 15){
                heSo = 13;
            } else {
                heSo = 16;
            }
        } else if(ma.substring(0, 1).equals("C")){
            int x = Integer.parseInt(ma.substring(1, 3));
            if(x >= 1 && x <= 3){
                heSo = 9;
            } else if(x >= 4 && x <= 8){
                heSo = 10  ;
            } else if(x >= 9 && x <= 15){
                heSo = 12;
            } else {
                heSo = 14;
            }
        } else {
            int x = Integer.parseInt(ma.substring(1, 3));
            if(x >= 1 && x <= 3){
                heSo = 8;
            } else if(x >= 4 && x <= 8){
                heSo = 9  ;
            } else if(x >= 9 && x <= 15){
                heSo = 11;
            } else {
                heSo = 13;
            }
        }
        luong = soNgay * luongcb * 1000 * heSo;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phongBan + " " + luong;
    }
    
    
}
