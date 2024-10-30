/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Customer {
    private String id, name, type;
    private int soDien, tong, VAT, trongdm, vuotdm;
    
    public Customer(){}
    public Customer(int id, String name, String type, int soDau, int soCuoi ){
        String tmp = String.valueOf(id);
        while(tmp.length() < 2){
            tmp = "0" + tmp;
        }
        this.id = "KH" + tmp;
        name = name.trim();
        String words[] = name.split("\\s+");
        String res = "";
        for(String word : words){
            if(!word.isEmpty()){
                String x = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                res += x;
                res += " ";
            }
        }
        res = res.trim();
        this.name = res;
        this.type = type;
        this.soDien = soCuoi - soDau;
        switch(this.type.charAt(0)){
            case 'A':
                if(this.soDien > 100){
                    this.trongdm = 100*450;
                    this.vuotdm = (this.soDien - 100)*1000;
                } else {
                    this.trongdm = this.soDien*450;
                    this.vuotdm = 0;
                }
                break;
            case 'B':
                if(this.soDien > 500){
                    this.vuotdm = (this.soDien - 500)*1000;
                    this.trongdm = 500*450;
                } else {
                    this.trongdm = this.soDien*450;
                    this.vuotdm = 0;
                }
                break;
            case 'C':
                if(this.soDien > 200){
                    this.vuotdm = (this.soDien - 200)*1000;
                    this.trongdm = 200*450;
                } else {
                    this.trongdm = this.soDien*450;
                    this.vuotdm = 0;
                }
                break;
        }
        this.VAT = Math.round(this.vuotdm / 20);
        this.tong = this.trongdm + this.vuotdm + this.VAT;    
    }
    public int getTong(){
        return this.tong;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " +  this.trongdm + " " +  this.vuotdm + " " + this.VAT + " " + this.tong;
    }
}
