/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoiTuongSinhVien3;

import java.util.*;
import DanhSachDoiTuongSinhVien3.Student;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        for(int i= 1; i <= n; i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String date = sc.nextLine();
            double gpa = sc.nextDouble();
            sc.nextLine();
            a.add(new Student(i, name, lop, date, gpa));
        }
        Collections.sort(a, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                 return Double.compare(b.getGpa(), a.getGpa());
            }
        });
        for(Student x : a){
            System.out.println(x);
        }
    }
}
//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0