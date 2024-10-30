/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XetTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author doa74
 */
class nguoithi{
    static int i=1;
    String ma;
    String ten;
    int tuoi;
    int diemtb;
    String xeploai;
    public nguoithi(String ten,int tuoi,int diemtb){
        ma="PH"+String.format("%02d",i++);
        this.ten=ten;
        this.tuoi=tuoi;
        this.diemtb=diemtb;
        if(this.diemtb<5){
            xeploai="Truot";
        }else if(this.diemtb<7){
            xeploai="Trung binh";
        }else if(this.diemtb==7){
            xeploai="Kha";
        }else if(this.diemtb==8){
            xeploai="Gioi";
        }else{
            xeploai="Xuat sac";
        }
    }
    @Override
    public String toString(){
        return ma+" "+ten+tuoi+" "+diemtb+" "+xeploai;
    }
    
    
}
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner sc = new Scanner(new File("XETTUYEN.in"));
       int n= Integer.parseInt(sc.nextLine());
       List<nguoithi> arr = new ArrayList<>();
       while(n-->0){
           String ten=sc.nextLine().trim();
           String x="";
           String a1[]=ten.split("\\s+");
           for(String z:a1){
               x+=z.substring(0,1).toUpperCase()+z.substring(1).toLowerCase()+" ";
           }
           String nam=sc.nextLine();
           int tuoi=2021-Integer.parseInt(nam.substring(nam.length()-4));
           float d1=Float.parseFloat(sc.nextLine());
           float d2=Float.parseFloat(sc.nextLine());
           float d=(d1+d2)/2;
           if(d1>=8&&d2>=8){
               d+=1f;
           }else if(d1>=7.5&&d2>=7.5){
               d+=0.5f;
           }
           
           int diemtb=Math.round(d);
           if(diemtb>10) diemtb=10;
           nguoithi a = new nguoithi(x,tuoi,diemtb);
           arr.add(a);
       }
       for(nguoithi cc:arr){
           System.out.println(cc);
       }
    }
}