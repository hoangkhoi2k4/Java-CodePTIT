
package object.j05021_sapXepTheoMaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<>();
        while(sc.hasNextLine()) {
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
