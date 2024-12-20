/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepNhanVienTheoThuNhap;

import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Employee> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new Employee(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(arr, new Comparator<Employee>(){
            @Override
            public int compare(Employee a, Employee b){
                return Double.compare(b.getThuNhap(), a.getThuNhap());
            }
        });
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
