/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanPhanSo;

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
    public PhanSo Tong(PhanSo x, PhanSo y){
        PhanSo res = new PhanSo(1, 1);
        res.a = x.a*y.b + y.a*x.b;
        res.b = x.b*y.b;
        return res;
    }
    
    public PhanSo Pow(PhanSo x){
        PhanSo res = new PhanSo(1, 1);
        res.a = x.a*x.a;
        res.b = x.b*x.b;
        return res;
    }
    public long gcd(long x, long y){
        if(y == 0) return x;
        return gcd(y, x%y);
    }
    public PhanSo Mul(PhanSo x, PhanSo y, PhanSo z){
        PhanSo res = new PhanSo(1, 1);
        res.a = x.a*y.a*z.a;
        res.b = x.b*y.b*z.b;
        return res;
    }
    
    @Override
    public String toString() {
        long g = gcd(this.a, this.b);
        return a / g + "/" + b / g;
    }
}
