
package object.j05010_sapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            items.add(new Item(
                    i, 
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        Collections.sort(items);
        
        for(Item i : items) {
            System.out.println(i);
        }
        
        sc.close();
    }

}
