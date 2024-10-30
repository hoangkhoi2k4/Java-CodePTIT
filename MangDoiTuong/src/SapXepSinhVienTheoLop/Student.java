/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepSinhVienTheoLop;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, lop, email;
    
    public Student(){
        
    }
    public Student(String id, String name, String lop, String email){
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    
    public String getId(){
        return this.id;
    }
    public String getLop(){
        return this.lop;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.lop + " " + this.email;
    }
}
