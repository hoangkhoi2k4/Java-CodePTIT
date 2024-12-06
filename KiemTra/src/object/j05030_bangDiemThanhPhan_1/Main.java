
package object.j05030_bangDiemThanhPhan_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while(n-- > 0) {
            students.add(new Student(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        Collections.sort(students);
        
        for(int i = 0; i < students.size(); i++) {
            System.out.print((i+1) + " ");
            System.out.println(students.get(i));
        }
        
        sc.close();
    }

}


