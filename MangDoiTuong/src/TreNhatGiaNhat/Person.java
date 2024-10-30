/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreNhatGiaNhat;

/**
 *
 * @author Hoang Van Khoi
 */
public class Person {
    private String name;
    private long tuoi;
    
    public Person(String name, String date){
        this.name = name;
        this.tuoi = Integer.parseInt(date.substring(0, 2)) + Integer.parseInt(date.substring(3, 5))*30 + Integer.parseInt(date.substring(6))*365;
    }
    
    public long getTuoi(){
        return this.tuoi;
    }
    public String getName(){
        return this.name;
    }
}
