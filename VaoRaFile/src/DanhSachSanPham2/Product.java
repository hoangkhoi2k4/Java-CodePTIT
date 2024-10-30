/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSanPham2;

/**
 *
 * @author Hoang Van Khoi
 */
public class Product {
    private String id, name;
    private int price, warranty;
    
    public Product(){}
    public Product(String id, String name, int price, int warranty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }
    public String getId(){
        return this.id;
    }
    public int getPrice(){
        return this.price;
    }
    @Override 
    public String toString(){
        return this.id + " " + this.name + " " + this.price + " " + this.warranty;
    }
}
