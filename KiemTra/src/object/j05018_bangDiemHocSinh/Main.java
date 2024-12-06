
package object.j05018_bangDiemHocSinh;

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
            String name = sc.nextLine();
            double[] s = new double[10];
            for(int j = 0; j < 10; j++) {
                s[j] = sc.nextDouble();
            }
            sc.nextLine();
            
            students.add(new Student(
                    String.format("HS%02d", i),
                    name,
                    s
            ));
        }
        
        Collections.sort(students);
        
        for(Student s : students) {
            System.out.println(s);
        }
        
        sc.close();
    }

}


