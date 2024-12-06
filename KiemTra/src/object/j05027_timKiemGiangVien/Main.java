
package object.j05027_timKiemGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            lecturers.add(new Lecturer(
                    String.format("GV%02d", i),
                    sc.nextLine(),
                    sc.nextLine()
            ));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String key = sc.nextLine();
            System.out.println(String.format("DANH SACH GIANG VIEN THEO TU KHOA %s:", key));
            for(Lecturer lecturer : lecturers) {
                if(lecturer.getName().toLowerCase().contains(key.toLowerCase())) {
                    System.out.println(lecturer);
                }
            }
        }
        
        sc.close();
    }

}
