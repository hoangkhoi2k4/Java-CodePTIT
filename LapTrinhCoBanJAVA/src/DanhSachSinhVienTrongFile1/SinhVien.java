/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSinhVienTrongFile1;

/**
 *
 * @author Hoang Van Khoi
 */
public class SinhVien {
    private String id, name, classRoom, email;

    public SinhVien(String id, String name, String classRoom, String email) {
        this.id = id;
        name = name.trim();
        String[] w = name.split("\\s+");
        String tmp = "";
        for(String x : w){
            tmp += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name = tmp.trim();
        this.classRoom = classRoom;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classRoom + " " + email ;
    }
    
    
}
