/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author Hoang Van Khoi
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Item {
    private String name;
    private int quantity;
    private double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }
}

class Order implements Comparable<Order> {
    private static int orderCounter = 1;
    private String code;
    private String buyerName;
    private String phone;
    private Date purchaseDate;
    private List<Item> items;
    private double totalPrice;

    public Order(String buyerName, String phone, Date purchaseDate, List<Item> items) {
        this.buyerName = buyerName;
        this.phone = phone;
        this.purchaseDate = purchaseDate;
        this.items = items;
        this.code = generateOrderCode(buyerName);
        calculateTotalPrice();
    }

    private String generateOrderCode(String buyerName) {
        String[] nameParts = buyerName.split(" ");
        String x = "";
        for(String a : nameParts){
            x += a.substring(0, 1).toUpperCase();
        }
        String lastName = x;
        String prefix = lastName.substring(0, Math.min(3, lastName.length()));
        String code = prefix + String.format("%03d", orderCounter);
        orderCounter++;
        return code;
    }

    private void calculateTotalPrice() {
        this.totalPrice = 0;
        for (Item item : items) {
            this.totalPrice += item.getTotalPrice();
        }
        this.totalPrice = Math.round(this.totalPrice); 
    }

    public String getCode() {
        return code;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public int compareTo(Order other) {
        return this.purchaseDate.compareTo(other.purchaseDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return code + " " + buyerName + " " + dateFormat.format(purchaseDate) + " " + (int) totalPrice;
    }
}

class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void sortOrdersByDate() {
        Collections.sort(orders);
    }

    public void displayOrders() {
//        for (Order order : orders) {
//            System.out.println(order);
//        }
        for(int i = orders.size() - 1; i >= 0; i--){
            System.out.println(orders.get(i));
        }
    }
}

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        int numberOfOrders = Integer.parseInt(scanner.nextLine());
        OrderManager manager = new OrderManager();

        for (int i = 0; i < numberOfOrders; i++) {
            String buyerName = scanner.nextLine();
            String phone = scanner.nextLine();
            Date purchaseDate = dateFormat.parse(scanner.nextLine());
            
            int numberOfItems = Integer.parseInt(scanner.nextLine());
            List<Item> items = new ArrayList<>();
            
            for (int j = 0; j < numberOfItems; j++) {
                String itemName = scanner.nextLine();
                int quantity = Integer.parseInt(scanner.nextLine());
                double unitPrice = Double.parseDouble(scanner.nextLine());
                items.add(new Item(itemName, quantity, unitPrice));
            }
            
            Order order = new Order(buyerName, phone, purchaseDate, items);
            manager.addOrder(order);
        }

        manager.sortOrdersByDate();
        manager.displayOrders();

        scanner.close();
    }
}

//3
//To an an
//0945338955
//02/03/2022
//1
//sua
//10
//200
//Lai Bac
//0912447845
//12/03/2022
//1
//tat
//5
//10
//Tran Tuan Anh
//0913663487
//03/05/2023
//1
//But bi
//10
//5