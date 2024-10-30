/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachThucTap1;

/**
 *
 * @author Hoang Van Khoi
 */
public class List {
    private String stt, id, name,classRoom, email, enterprise;
    
    public List(){}
    public List(String stt, String id, String name, String classRoom, String email, String enterprise){
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.email = email;
        this.enterprise = enterprise;
    }
    
    public String getEnterprise(){
        return this.enterprise;
    }
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.stt + " " + this.id + " " + this.name + " " + this.classRoom + " " + this.email + " " + this.enterprise;
    }
}
