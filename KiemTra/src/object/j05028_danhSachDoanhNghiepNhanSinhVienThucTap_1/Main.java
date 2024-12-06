
package object.j05028_danhSachDoanhNghiepNhanSinhVienThucTap_1;

import java.util.ArrayList;
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
        
        for(Company c : companies) {
            System.out.println(c);
        }
        
        sc.close();
    }

}

