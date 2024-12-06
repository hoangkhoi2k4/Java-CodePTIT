
package object.j05026_danhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static String convert(String subject) {
        StringBuilder sb = new StringBuilder();
        for(String w : subject.split("\\s+")) {
            sb.append(w.substring(0, 1).toUpperCase());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, ArrayList<Lecturer>> map = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++) {
            Lecturer lecturer = new Lecturer(
                    String.format("GV%02d", i),
                    sc.nextLine(),
                    convert(sc.nextLine())
            );
            String key = lecturer.getSubject();
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(lecturer);
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String key = convert(sc.nextLine());
            System.out.println(String.format("DANH SACH GIANG VIEN BO MON %s:", key));
            for(Lecturer l : map.get(key)) {
                System.out.println(l);
            }
        }
        
        sc.close();
    }

}
