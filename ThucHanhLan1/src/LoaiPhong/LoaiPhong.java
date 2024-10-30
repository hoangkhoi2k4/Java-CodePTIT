/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoaiPhong;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String line, name;
    
    public LoaiPhong (){
        
    }
    public LoaiPhong (String s){
        this.line = s;
        String[] arr = s.split("\\s+");
        this.name = arr[1].trim();
    }
    public String getName(){
        return this.name;
    }
    @Override 
    public String toString(){
        return this.line;
    }
    
    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.getName());
    }
}
