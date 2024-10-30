/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Customer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new Customer(i, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<Customer>(){
            @Override
            public int compare(Customer a, Customer b){
                return b.getTong() - a.getTong();
            }
        });
        for(Customer x : arr){
            System.out.println(x);
        }
    }
}
