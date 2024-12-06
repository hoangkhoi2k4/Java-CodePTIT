package BT3;

import java.util.*;
import java.io.Serializable;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chien
 */
public class Oto implements Serializable{
    private String ma,loaiXe;
    private double tienThue;
    private String soXe;

    public Oto() {
    }

    public Oto(String ma, String loaiXe, double tienThue, String soXe) {
        this.ma = ma;
        this.loaiXe = loaiXe;
        this.tienThue = tienThue;
        this.soXe = soXe;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getTienThue() {
        return tienThue;
    }

    public void setTienThue(double tienThue) {
        this.tienThue = tienThue;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,loaiXe,tienThue,soXe
        };
    }
}
