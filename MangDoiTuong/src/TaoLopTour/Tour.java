/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaoLopTour;

/**
 *
 * @author Hoang Van Khoi
 */
public class Tour {
    private String ma, tu, den;
    private int soNguoi;
    private double gia;
    
    public Tour(String ma, String tu, String den,int soNguoi ,double gia){
        this.ma = ma;
        this.tu = tu;
        this.den = den;
        this.gia = gia;
        this.soNguoi = soNguoi;
    }
    
    public String getMa(){
        return this.tu + "-" + this.den + "*" + this.ma;
    }
    public double getThanhTien(){
        double res = this.gia * this.soNguoi;
        if(this.soNguoi < 5) {
              return res;
        } else if( this.soNguoi <= 10){
            return res - (double) res/10;
        } else {
            return res - (double)res/5;
        }
    }
    
    @Override
    public String toString(){
        return this.getMa() + " " + this.soNguoi + " " + String.format("%.1f", this.gia) + " " + String.format("%.1f", this.getThanhTien());
    }
}
