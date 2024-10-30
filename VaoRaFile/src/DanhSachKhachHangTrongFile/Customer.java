/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachKhachHangTrongFile;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Hoang Van Khoi
 */
public class Customer {
    private String id, name, gender, date, address;
    private LocalDate date1;

    public Customer(int id, String name, String gender, String date, String address) {
        this.id = String.format("KH%03d", id);
        String[] words = name.trim().split("\\s+");
        String tmp = "";
        for(String x : words){
            tmp += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        
        this.name = tmp.trim();
        this.gender = gender;
        String da = "";
        try{
            SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
            Date d = formater.parse(date);
            da = formater.format(d);
            
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            date1 = LocalDate.parse(da, formatter);
            
        } catch(Exception e){
            
        }
        
        this.date = da;
        this.address = address;
    }
    
    public LocalDate getDate(){
        return date1;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.gender + " " + this.address + " " + this.date;
    }
    
    
}
