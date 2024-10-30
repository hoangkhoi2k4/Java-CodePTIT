/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachTrungTuyen;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> contestants = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            contestants.add(new Student(
                    input.nextLine(),
                    input.nextLine(),
                    Double.parseDouble(input.nextLine()),
                    Double.parseDouble(input.nextLine()),
                    Double.parseDouble(input.nextLine())
            ));
        }
        int count = input.nextInt();
        contestants.sort(Comparator
                .comparing(Student::getScore).reversed()
                .thenComparing(Student::getId)
        );
        double endScore = contestants.get(count-1).getScore();
        System.out.println(String.format("%.1f", endScore));
        for(Student e : contestants) {
            System.out.print(e);
            if(e.getScore() >= endScore) {
                System.out.println("TRUNG TUYEN");
            } else {
                System.out.println("TRUOT");
            }
        }
        input.close();
    }

}