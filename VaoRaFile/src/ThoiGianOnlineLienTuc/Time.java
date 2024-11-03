/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThoiGianOnlineLienTuc;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Hoang Van Khoi
 */
public class Time implements Comparable<Time>{
    private String name;
    private LocalDateTime start, end;
    private long onlineTime;

    public Time(String name, String start, String end, DateTimeFormatter formatter) {
        this.name = name;
        this.start = LocalDateTime.parse(start, formatter);
        this.end = LocalDateTime.parse(end, formatter);
        this.onlineTime = Duration.between(this.start, this.end).toMinutes();
    }

    @Override
    public String toString() {
        return  name + " " + onlineTime ;
    }

    @Override
    public int compareTo(Time o) {
        if(o.onlineTime == this.onlineTime){
            return this.name.compareTo(o.name);
        }
        return Long.compare(o.onlineTime, this.onlineTime);
    }
    
    
}
