
package object.j05022_lietKeSinhVienTheoLop;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, ArrayList<Student>> students = new LinkedHashMap<>();
        while(n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String classId = sc.nextLine();
            String email = sc.nextLine();
            if(!students.containsKey(classId)) {
                students.put(classId, new ArrayList<>());
            }
            students.get(classId).add(new Student(id, name, classId, email));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String classId = sc.nextLine();
            System.out.println(String.format("DANH SACH SINH VIEN LOP %s:", classId));
            for(Student s : students.get(classId)) {
                System.out.println(s);
            }
        }
        
        sc.close();
    }

}


