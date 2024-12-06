
package object.j05081_danhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 1; i <= m; i++) {
            items.add(new Item(
                    String.format("MH%03d", i),
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())
            ));
        }
        
        Collections.sort(items);
        
        for(Item i : items) {
            System.out.println(i);
        }
    }

}


