
package object.j05011_tinhGio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Gamer> gamers = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            gamers.add(new Gamer(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            ));
        }
        
        Collections.sort(gamers);
        
        for(Gamer g : gamers) {
            System.out.println(g);
        }
        
        sc.close();
    }

}


