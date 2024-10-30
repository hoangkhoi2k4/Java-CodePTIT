/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoNganh;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, classRoom, email;
    public Student(){
        
    }
    public Student(String id, String name, String classRoom, String email){
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.email = email;
    }
    
    public String getId(){
        return this.id;
    }
    public String getClassRoom(){
        return this.classRoom.substring(0, 1);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + classRoom + " " + email;
    }
}
