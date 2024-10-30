/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMonHoc;

/**
 *
 * @author Hoang Van Khoi
 */
public class Mon {
    private String id, name;
    private int soTC;
    
    public Mon(String id, String name, int soTC){
        this.id = id;
        this.name = name;
        this.soTC = soTC;
    }
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.soTC;
    }
}
