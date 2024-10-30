/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangXepHang;

/**
 *
 * @author Hoang Van Khoi
 */
public class Rank {
    private String name;
    private int C, T;
    
    public Rank(String name, int C, int T){
        this.name = name;
        this.C = C;
        this.T = T;
    }
    
    public int getC(){
        return this.C;
    }
    public int getT(){
        return this.T;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.C + " " + this.T;
    }
}
