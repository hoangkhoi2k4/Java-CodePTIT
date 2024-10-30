/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachGiangVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Lecturer {
    private String id, name, department;
    
    public Lecturer(){
        this.id = this.name = this.department = "";
    }

    public Lecturer(int id, String name, String department){
        String tmp = String.valueOf(id);
        while(tmp.length() < 2){
            tmp = "0" + tmp;
        }
        this.id = "GV" + tmp;
        this.name = name;
        this.department = "";

        String arr[] = department.split("\\s+");
        for(int i = 0; i < arr.length; i++){
            this.department += arr[i].toUpperCase().charAt(0);
        }
    }

    public String getName(){
        String arr[] = this.name.split("\\s+");
        return arr[arr.length - 1];
    }
    
    public String getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.department;
    }
}
