/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepHangHocSinh;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> hs = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            hs.add(new Student("HS" + String.format("%02d", i), sc.nextLine(), sc.nextDouble()));
        }
        Collections.sort(hs, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getDiemTB() > o2.getDiemTB())
                    return -1;
                else return 1;
            }
        });
        hs.get(0).setXepHang(1);
        for (int i = 1; i < n; i++) {
            if (hs.get(i).getDiemTB() == hs.get(i - 1).getDiemTB()) {
                hs.get(i).setXepHang(hs.get(i - 1).getXepHang());
            } else {
                hs.get(i).setXepHang(i + 1);
            }
        }
        Collections.sort(hs, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMaHS().compareTo(o2.getMaHS());
            }
        });
        for (Student x : hs) {
            System.out.println(x);
        }
    }
}
//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2