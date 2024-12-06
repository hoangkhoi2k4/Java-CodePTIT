
package object.j05006_danhSachDoiTuongNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            employees.add(new Employee(
                    String.format("%05d", i),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            ));
        }
        
        for(Employee e : employees) {
            System.out.println(e);
        }
        
        sc.close();
    }

}


