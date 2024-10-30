/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopSinhVien;
import java.util.*;
import KhaiBaoLopSinhVien.Student;


/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student(sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
        System.out.println(a);
    }
}
