
package object.j05003_danhSachDoiTuongSinhVien_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            students.add(new Student(
                    String.format("B20DCCN%03d", i),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        for(Student e : students) {
            System.out.println(e);
        }
        
        sc.close();
        
    }

}
