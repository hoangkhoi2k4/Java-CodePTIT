/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepMatHang;

/**
 *
 * @author Hoang Van Khoi
 */
public class Merchandise {
    private String id, name, group;
    private double price_buy, price_sell, profit;
    
    public Merchandise(){}
    public Merchandise(String id, String name, String group, double price_buy,double price_sell){
        this.id = id;
        this.name = name;
        this.group = group;
        this.price_buy = price_buy;
        this.price_sell = price_sell;
        this.profit = this.price_sell - this.price_buy;
    }
    
    public double getProfit(){
        return this.profit;
    }
    
    @Override
    public String toString(){
        return this.id + " " +this.name + " " + this.group + " " + String.format("%.2f", this.profit);
    }
}
