/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiToanTuyenSinh;

/**
 *
 * @author Hoang Van Khoi
 */
public class Candidate {
    private String id, name;
    private double toan, ly, hoa, tong, ut;
    private boolean status;
    
    public Candidate(String id, String name, double toan, double ly, double hoa){
        this.id = id;
        this.name = name;
        this.toan = toan*2;
        this.ly = ly;
        this.hoa = hoa;
        this.tong = toan*2 + ly + hoa;
        
        
        if(this.id.charAt(2) == '1'){
            this.ut = 0.5;
        } else if(this.id.charAt(2) == '2'){
            this.ut = 1;
        } else if(this.id.charAt(2) == '3'){
            this.ut = 1.5;
        } else {
            this.ut = 0;
        }   
        
        if(this.tong + this.ut>= 24.0) {
            this.status = true;
        } else {
            this.status = false;
        }
    }
    @Override
    public String toString(){
        String res = "";
        res = this.id + " " + this.name + " ";
        if(this.ut == (long)this.ut){
            res = res + ((long)this.ut) + " ";
        } else {
            res = res + String.format("%.1f", this.ut) + " ";
        }
        if(this.tong == (long)this.tong){
            res = res + ((long)this.tong) + " ";
        } else {
            res = res + String.format("%.1f", this.tong) + " ";
        }
        if(this.status == true){
            res = res + "TRUNG TUYEN";
        } else {
            res = res + "TRUOT";
        }
        
        return res;
    }
    
    
}
