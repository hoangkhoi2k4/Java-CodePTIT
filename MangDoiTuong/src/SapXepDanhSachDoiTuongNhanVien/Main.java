/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachDoiTuongNhanVien;
import java.util.*;
import SapXepDanhSachDoiTuongNhanVien.Employee;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Employee> a = new ArrayList<>();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            a.add(new Employee(i, sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        
        Collections.sort(a, new Comparator<Employee>() {
            @Override
            public int compare(Employee b, Employee c) {
                String date1 = b.getDate();
                String date2 = c.getDate();

                int year1 = Integer.parseInt(date1.substring(6));
                int year2 = Integer.parseInt(date2.substring(6));
                int month1 = Integer.parseInt(date1.substring(3, 5)); 
                int month2 = Integer.parseInt(date2.substring(3, 5)); 
                int day1 = Integer.parseInt(date1.substring(0, 2));
                int day2 = Integer.parseInt(date2.substring(0, 2));

                if (year1 != year2) {
                    return year1 - year2; 
                } else if (month1 != month2) {
                    return month1 - month2; 
                } else {
                    return day1 - day2;
                }
            }
        });
        
        for(Employee x : a){
            System.out.println(x);
        }
    }
    
}
