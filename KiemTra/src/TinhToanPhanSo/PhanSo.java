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
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    public void RutGon(){
        long uc = gcd(tu, mau);
        tu = tu / uc;
        mau = mau / uc;
    }
    
    public static PhanSo add(PhanSo a, PhanSo b){
        PhanSo res = new PhanSo(0, 0);
        res.tu = a.tu * b.mau + b.tu * a.mau;
        res.mau = a.mau * b.mau;
        res.RutGon();
        return res;
    }
    
    public static PhanSo mul(PhanSo a, PhanSo b){
        PhanSo res = new PhanSo(0, 0);
        res.tu = a.tu * b.tu ;
        res.mau = a.mau * b.mau;
        res.RutGon();
        return res;
    }

    @Override
    public String toString() {
        return tu + "/" + mau ;
    }
    
    
}
