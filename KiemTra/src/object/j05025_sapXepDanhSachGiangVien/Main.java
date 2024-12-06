
package object.j05025_sapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
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
        
        Collections.sort(lecturers);
        
        for(Lecturer l : lecturers) {
            System.out.println(l);
        }
        
        sc.close();
    }

}


