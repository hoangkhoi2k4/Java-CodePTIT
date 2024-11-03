/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDongPhucSinhVienPTIT;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name, className, email, phone, gender, size;

    public Student(String id, String name, String gender, String className, String email, String phone) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email + " " + phone ;
    }
    
    
}
