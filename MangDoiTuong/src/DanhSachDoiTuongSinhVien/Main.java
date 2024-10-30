/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoiTuongSinhVien;
import java.util.*;
import DanhSachDoiTuongSinhVien.Student;
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
            a.add(new  Student(i, name, lop, date, gpa));
        }
        
        for(Student x : a){
            System.out.println(x);
        }
    }
}
//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19