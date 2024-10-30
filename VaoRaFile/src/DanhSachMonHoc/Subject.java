/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMonHoc;

/**
 *
 * @author Hoang Van Khoi
 */
public class Subject {
    private String id, name;
    private int sotc;
    
    public Subject(){}
    public Subject(String id, String name, int sotc){
        this.id = id;
        this.name = name;
        this.sotc = sotc;
    }
    public String getName(){
        return this.name;
    }
    
    @Override 
    public String toString(){
        return this.id + " " + this.name + " " + this.sotc;
    }
}
