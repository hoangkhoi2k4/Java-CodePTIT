/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanSO;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
class PhanSo {
    private long tuSo, mauSo;
    public PhanSo(){
        tuSo = 1;
        mauSo = 1;
    }
    public PhanSo(long tuSo, long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public void input(Scanner sc){
        this.tuSo = sc.nextLong();
        this.mauSo = sc.nextLong();
    }
    
    public void out(){
        if(this.tuSo != 0 && this.mauSo > 0)
            System.out.println(this.tuSo + "/" + this.mauSo);
        else if(this.tuSo == 0){
            System.out.println("0");
        } else if(this.mauSo < 0){
            this.tuSo *= -1;
            this.mauSo*= -1;
            System.out.println(this.tuSo + "/" + this.mauSo);

        }
    }
    public long gcd(long x, long y){
        if(y == 0) return x;
        return gcd(y, x%y);
    }
    public PhanSo hieu(PhanSo a){
        long chung = this.mauSo* a.mauSo;
        PhanSo res = new PhanSo();
        res.mauSo = chung;
        res.tuSo = this.tuSo * a.mauSo - this.mauSo*a.tuSo;
        long gc = gcd(res.tuSo, res.mauSo);
        res.tuSo = res.tuSo / gc;
        res.mauSo = res.mauSo/gc;
        return res;
    }
}

//123 456 12 34
//3 4 3 4
//-1 4 1 10
