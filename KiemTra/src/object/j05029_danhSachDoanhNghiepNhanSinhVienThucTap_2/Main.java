
package object.j05029_danhSachDoanhNghiepNhanSinhVienThucTap_2;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Company> companies = new ArrayList<>();
        while(n-- > 0) {
            companies.add(new Company(
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine())
            ));
        }
        
        Collections.sort(companies);
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(String.format("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:", a, b));
            for(Company c : companies) {
                if(a <= c.getNumberOfStudents() && c.getNumberOfStudents() <= b) {
                    System.out.println(c);
                }
            }
        }
         
        sc.close();
    }

}

