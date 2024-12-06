
package object.j05034_danhSachThucTap_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, TreeSet<Student>> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            Student student = new Student(
                    i,
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            );
            String key = student.getCompany();
            if(!map.containsKey(key)) {
                map.put(key, new TreeSet<>());
            }
            map.get(key).add(student);
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String key = sc.nextLine();
            for(Student s : map.get(key)) {
                System.out.println(s);
            }
        }
        
        sc.close();
    }

}


