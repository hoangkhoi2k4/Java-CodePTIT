/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepThoiGian;
/**
 *
 * @author Hoang Van Khoi
 */
public class Time implements Comparable<Time>{
    private int hour, minute, second;
    
    
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    @Override
    public int compareTo(Time o){
        if(this.hour != o.hour){
            return this.hour - o.hour;
        } else if(this.minute != o.minute){
            return this.minute - o.minute;
        } else {
            return this.second - o.second;
        }
    }
    
    @Override
    public String toString(){
        return this.hour + " " + this.minute + " " + this.second;
    }
}
