/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopHinhChuNhat;

/**
 *
 * @author Hoang Van Khoi
 */

public class Rectange{
    private double w, h;
    private String color;
    
    public Rectange(){
        this.w = this.h = 1;
        this.color = "";
    }
    public Rectange(double w, double h, String color){
        this.w = w;
        this.h = h;
        this.color = color;
    }
    
    
    public double getWidth(){
        return this.w;
    }
    
    public double getHeight(){
        return this.h;
    }
    
    public String getColor()
    {
        String x = color.toLowerCase();
        StringBuilder sb = new StringBuilder(x);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        x = sb.toString();
        return x;
    }
    
    public void setWidth(double w){
        this.w = w;
    }
    
    public void setHeighr(double h){
        this.h = h;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        double ans = this.w*this.h;
        return ans;
    }
    public double findPerimeter(){
        double ans = this.w + this.h;
        return ans*2.0;
    }
}
