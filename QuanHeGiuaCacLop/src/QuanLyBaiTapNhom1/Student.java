/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBaiTapNhom1;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id ,name, phone, stt;

    public Student(String id, String name, String phone, String stt) {
        this.id = id;
        String[] w = name.trim().split("\\s+");
        String tmp = "";
        for(String x : w){
            tmp += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name = tmp.trim();
        this.phone = phone;
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public String getStt() {
        return stt;
    }
    
    

    @Override
    public String toString() {
        return id + " " + name + " " + phone ;
    }
    
    
}
