/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DongPhuc;

/**
 *
 * @author Hoang Van Khoi
 */
public class SinhVien {
    public String id, name, classRoom, email, phoneNumber, gender, size;

    public SinhVien(String id, String name, String classRoom, String email, String phoneNumber, String gender) {
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        size  = "";
    }


    @Override
    public String toString() {
        return id + " " + name + " " + classRoom + " " + email + " " + phoneNumber;
    }
}
