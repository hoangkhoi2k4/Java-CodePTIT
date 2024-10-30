/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMonThi;

/**
 *
 * @author Hoang Van Khoi
 */
public class Subject implements Comparable<Subject>{
    private  String id, name, form;

    public Subject(String id, String name, String form) {
        this.id = id;
        this.name = name;
        this.form = form;
    }

    @Override
    public int compareTo(Subject o) {
        return this.id.compareTo(o.id);
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + form;
    }
    
    
}
