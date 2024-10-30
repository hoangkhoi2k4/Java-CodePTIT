/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoKhoa;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, classRoom, email;
    
    public Student(String id, String name, String classRoom, String email){
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.email = email;
    }
        public String getKhoa(){
        return this.classRoom.substring(1, 3);
    }
    @Override 
    public String toString(){
        return this.id + " " + this.name +  " " + this.classRoom + " " + this.email;
    }
}
