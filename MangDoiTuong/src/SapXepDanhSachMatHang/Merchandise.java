/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachMatHang;

/**
 *
 * @author Hoang Van Khoi
 */
public class Merchandise{
    private String id, name, group;
    private double priceBuy, priceSell;


    public Merchandise(int ma,String name, String group, double priceBuy, double priceSell){
        this.id = String.valueOf(ma);
        this.name = name;
        this.group = group;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }
      
    public double getProfit() {
        return (double)(this.priceSell - this.priceBuy);
    }

      
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.group + " "  + String.format("%.2f",this.priceSell - this.priceBuy);
    }
}
