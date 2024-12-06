/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepKetQuaTuyenSinh;


/**
 *
 * @author Hoang Van Khoi
 */
public class Student implements Comparable<Student>{
    private String id, name;
    private double ut, tong;
    private String status;

    public Student(String id, String name, double diem1, double diem2, double diem3) {
        this.id = id;
        this.name = name;
        if(id.substring(2,3).equals("1")){
            ut = 0.5;
        } else if(id.substring(2,3).equals("2")){
            ut = 1;
        } if(id.substring(2,3).equals("3")){
            ut = 2.5;
        }
        this.tong = diem1*2 + diem2 + diem3;
        if(tong + ut >= 24){
            status = "TRUNG TUYEN";
        } else {
            status = "TRUOT";
        }
    }

    @Override
    public String toString() {
        String res = "";
        res = this.id + " " + this.name + " ";
        if(this.ut == (long)this.ut){
            res = res + ((long)this.ut) + " ";
        } else {
            res = res + String.format("%.1f", this.ut) + " ";
        }
        if(this.tong + ut== (long)(this.tong + ut)){
            res = res + ((long)(this.tong + ut)) + " ";
        } else {
            res = res + String.format("%.1f", this.tong +this.ut) + " ";
        }
        res = res + status;
        
        return res;
    }

    @Override
    public int compareTo(Student o) {
        if(this.tong + this.ut == o.tong + o.ut){
            return this.id.compareTo(o.id);
        } 
        return Double.compare(o.tong + o.ut, this.tong + this.ut);
    }
}
