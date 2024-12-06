
package object.j05023_lietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, ArrayList<Student>> map = new LinkedHashMap<>();
        while(n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String classId = sc.nextLine();
            String email = sc.nextLine();
            String key = "20" + classId.substring(1, 3);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(new Student(id, name, classId, email));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String key = sc.nextLine();
            System.out.println(String.format("DANH SACH SINH VIEN KHOA %s:", key));
            for(Student s : map.get(key)) {
                System.out.println(s);
            }
        }
        
        sc.close();
    }

}

