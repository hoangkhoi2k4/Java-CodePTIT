
package object.j05024_lietKeSinhVienTheoNganh;

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
            String key = null;
            switch (id.substring(3, 7)) {
                case "DCKT":
                    key = "KE TOAN";
                    break;
                case "DCCN":
                    if(!classId.startsWith("E")) {
                        key = "CONG NGHE THONG TIN";
                    }
                    break;
                case "DCAT":
                    if(!classId.startsWith("E")) {
                        key = "AN TOAN THONG TIN";
                    }
                    break;
                case "DCVT":
                    key = "VIEN THONG";
                    break;
                case "DCDT":
                    key = "DIEN TU";
                    break;
            }
            if(key != null) {
                if(!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(new Student(id, name, classId, email));
            }
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String key = sc.nextLine().toUpperCase();
            System.out.println(String.format("DANH SACH SINH VIEN NGANH %s:", key));
            for(Student s : map.get(key)) {
                System.out.println(s);
            }
        }
        
        sc.close();
    }

}


