/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.Serializable;

public class Car implements Serializable {
    private static int idCounter = 1000;
    private int carID;
    private String carType;
    private double rentalRate;
    private int quantity;
    
    public Car(String carType, double rentalRate, int quantity) {
        this.carID = idCounter++;
        this.carType = carType;
        this.rentalRate = rentalRate;
        this.quantity = quantity;
    }

    public int getCarID() {
        return carID;
    }

    public String getCarType() {
        return carType;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return carID + " - " + carType + " - " + rentalRate + " - " + quantity;
    }
}
