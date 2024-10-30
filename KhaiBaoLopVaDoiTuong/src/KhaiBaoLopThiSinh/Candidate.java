/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopThiSinh;

/**
 *
 * @author Hoang Van Khoi
 */
public class Candidate {
    private String name, date;
    private float mon1, mon2, mon3, total;
    
    
    public Candidate(String name, String date, float mon1, float mon2, float mon3){
        this.name = name;
        this.date = date;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.total = mon1 + mon2 + mon3;
    }
    
//    @Override
    public String Print(){
        return this.name + " " + this.date + " " + this.total;
    }
}
