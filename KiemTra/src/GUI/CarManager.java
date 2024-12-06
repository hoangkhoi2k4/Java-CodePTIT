/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> carList;
    private static final String FILE_NAME = "OTO.DAT";
    
    public CarManager() {
        carList = new ArrayList<>();
        loadFromFile();
    }
    
    public void addCar(Car car) {
        carList.add(car);
    }
    
    public void removeCar(int carID) {
        carList.removeIf(car -> car.getCarID() == carID);
    }
    
    public List<Car> getCarList() {
        return carList;
    }
    
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(carList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            carList = (List<Car>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            carList = new ArrayList<>();
        }
    }
    
    public void updateCar(int carID, String carType, double rentalRate, int quantity) {
        for (Car car : carList) {
            if (car.getCarID() == carID) {
                car.setCarType(carType);
                car.setRentalRate(rentalRate);
                car.setQuantity(quantity);
                break;
            }
        }
    }

}

