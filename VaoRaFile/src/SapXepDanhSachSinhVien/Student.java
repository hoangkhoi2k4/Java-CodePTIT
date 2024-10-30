/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachSinhVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student implements Comparable<Student> {
    private String id, name, phoneNumber, email, tendem, ten, ho;

    public Student(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        String[] words = name.split("\\s+");
        ho = words[0];
        ten = words[words.length - 1];
        String x = "";
        for(int i = 1; i < words.length - 1; i ++){
            x += words[i] + " ";
        }
        tendem = x.trim();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + email;
    }

    @Override
    public int compareTo(Student o) {
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(o.ho)){
                if(this.tendem.equals(o.tendem)){
                    return this.id.compareTo(o.id);
                }
                return this.tendem.compareTo(o.tendem);
            }
            return this.ho.compareTo(o.ho);
        }
        return this.ten.compareTo(o.ten);
    }
    
    
    
}
