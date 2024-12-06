
package object.j04012_baiToanTinhCong;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee(
                "NV01", 
                sc.nextLine(), 
                Integer.parseInt(sc.nextLine()), 
                Integer.parseInt(sc.nextLine()), 
                sc.nextLine()
        );
        System.out.println(employee);
    }

}


