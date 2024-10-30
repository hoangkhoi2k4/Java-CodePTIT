/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMatHang;
import java.util.*;
import DanhSachMatHang.Merchandise;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  

        ArrayList<Merchandise> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
             a.add(new Merchandise(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
             sc.nextLine(); 
        }

        Collections.sort(a, new Comparator<Merchandise>() {
            @Override
            public int compare(Merchandise m1, Merchandise m2) {
                int profit1 = m1.getProfit();
                int profit2 = m2.getProfit();

                if (profit1 != profit2) {
                    return profit2 - profit1; 
                } else {
                    return m1.getId().compareTo(m2.getId()); 
                }
            }
        });

        for (Merchandise m : a) {
            System.out.println(m);
        }
    }
}
