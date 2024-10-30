/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachLuuTru;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer {
    private String id, name, roomId;
    private LocalDate checkIn, checkOut;
    private int days;
    
    public Customer() {}
    
    public Customer(String id, String name, String roomId, String checkIn, String checkOut) {
        this.id = id;
        this.name = name;
        this.roomId = roomId;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.checkIn = LocalDate.parse(checkIn, formatter);  
        this.checkOut = LocalDate.parse(checkOut, formatter); 
        this.days = (int) ChronoUnit.DAYS.between(this.checkIn, this.checkOut); 
    }
    
    public int getDay(){
        return this.days;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + roomId + " " + days;
    }
}
