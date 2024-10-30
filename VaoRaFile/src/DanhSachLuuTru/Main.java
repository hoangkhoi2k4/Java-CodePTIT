/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachLuuTru;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        ArrayList<Customer> arr = new ArrayList<>();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String id = String.valueOf(i);
            while(id.length() < 2){
                id = "0" + id;
            }
            id  = "KH" + id;
            arr.add(new Customer(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Customer>(){
            @Override
            public int compare(Customer a, Customer b){
                return b.getDay() - a.getDay();
            }
        });
        for(Customer x : arr){
            System.out.println(x);
        }
    }
}
