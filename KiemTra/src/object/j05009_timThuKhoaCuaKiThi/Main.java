
package object.j05009_timThuKhoaCuaKiThi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Contestant> contestants = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            contestants.add(new Contestant(
                    i + "",
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        Collections.sort(contestants);
        
        System.out.println(contestants.get(0));
        for(int i = 1; i < n; i++) {
            if(contestants.get(i).getTotal() == contestants.get(i-1).getTotal()) {
                System.out.println(contestants.get(i));
            } else {
                break;
            }
        }
        
        sc.close();
    }

}


