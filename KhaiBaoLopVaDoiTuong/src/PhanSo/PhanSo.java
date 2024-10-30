/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanSo;

/**
 *
 * @author Hoang Van Khoi
 */
public class PhanSo {
    private long a, b;
    
    public PhanSo(long a, long b){
        this.a = a;
        this.b = b;
    }
    
    public long getA(){
        return this.a;
    }
    public long getB(){
        return this.b;
    }
    
    public long gcd(long x, long y){
        if(y == 0) return x;
        return gcd(y, x%y);
    }
    
    @Override
    public String toString() {
        long g = gcd(this.a, this.b);
        return a / g + "/" + b / g;
    }
}
