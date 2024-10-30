/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoanhNghiep;

/**
 *
 * @author Hoang Van Khoi
 */
public class List {
    private String id, name;
    private int quantity;
    
    public List(){};
    public List(String id, String name, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String getId(){
        return this.id;
    }
    
    @Override 
    public String toString(){
        return this.id + " " + this.name + " " + this.quantity;
    }
}
