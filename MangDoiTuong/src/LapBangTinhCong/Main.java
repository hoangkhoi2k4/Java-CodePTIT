/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapBangTinhCong;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Employee> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String name = sc.nextLine();
            long a = sc.nextLong();
            long b = sc.nextLong();
            sc.nextLine();
            String chuc = sc.nextLine();
            arr.add(new Employee(i, name, a, b, chuc));
        }
        long total = 0;
        for(Employee x : arr){
            System.out.println(x);
            total += x.getThuNhap();
        }
    }
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV