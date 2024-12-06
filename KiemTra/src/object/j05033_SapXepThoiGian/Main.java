
package object.j05033_SapXepThoiGian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        while(n-- > 0) {
            times.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        
        Collections.sort(times);
        
        for(Time t : times) {
            System.out.println(t);
        }
    }

}
