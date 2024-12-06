
package object.j05032_treNhatGiaNhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<People> people = new ArrayList<>();
        while(n-- > 0) {
            people.add(new People(sc.next(), sc.next()));
        }
        
        Collections.sort(people);
        
        System.out.println(people.get(people.size()-1));
        System.out.println(people.get(0));
        
        sc.close();
    }

}
