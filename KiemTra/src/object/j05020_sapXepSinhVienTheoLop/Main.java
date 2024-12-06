
package object.j05020_sapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            students.add(new Student(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            ));
        }
        
        Collections.sort(students);

        for(Student s : students) {
            System.out.println(s);
        }
        
        sc.close();
    }

}


