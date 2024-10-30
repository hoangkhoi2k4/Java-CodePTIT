/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhThuNhapGiaoVien;
import java.util.*;
import TinhThuNhapGiaoVien.Teacher;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher a = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(a);
    }
}
