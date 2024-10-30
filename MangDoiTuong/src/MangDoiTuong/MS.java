/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
class Vihicle{
    private String vin;
    private String manufacturer;
    private int year;
    private double cost;
    private String color;

    public Vihicle() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void input(Scanner in) {
        vin = in.nextLine();
        manufacturer = in.nextLine();
        color = in.nextLine();
        year = in.nextInt();
        cost = in.nextDouble();
        in.nextLine(); 
    }

    @Override
    public String toString() {
        return vin + " " + manufacturer.toUpperCase() + " " + cost + " " + year + " " + color;
    }
    
}
public class MS {
    private Vihicle[] a; 

    public MS() {
    }

    
    public void input(Scanner in) {
        int n = in.nextInt();
        in.nextLine(); 
        a = new Vihicle[n]; 

        for (int i = 0; i < n; i++) {
            a[i] = new Vihicle(); 
            a[i].input(in); 
        }
    }

    public void out() {
        for (Vihicle vihicle : a) {
            System.out.println(vihicle);
        }
        System.out.println(a.length); 
    }
}
