/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMatHang;

/**
 *
 * @author Hoang Van Khoi
 */


public class Merchandise{
    private String id, name, unit;
    private int priceBuy, priceSell;


    public Merchandise(int ma,String name, String unit, int priceBuy, int priceSell){
        this.id = String.valueOf(ma);
        while(this.id.length() < 3){
            this.id =  "0" + this.id;
        }
        this.id = "MH" + this.id;

        this.name = name;
        this.unit = unit;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }
      
    public int getProfit() {
        return this.priceSell - this.priceBuy;
    }

    public String getId() {
        return this.id;
    }
      
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.unit + " " + this.priceBuy + " " + this.priceSell + " " + (this.priceSell - this.priceBuy);
    }
}
