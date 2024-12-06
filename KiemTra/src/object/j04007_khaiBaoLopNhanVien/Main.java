
package object.j04007_khaiBaoLopNhanVien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee(
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()
        );
        System.out.println(employee);
    }

}
