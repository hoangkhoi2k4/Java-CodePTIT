
package object.j04005_khaiBaoLopThiSinh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contestant contestant = new Contestant(
                sc.nextLine(),
                sc.nextLine(),
                Double.parseDouble(sc.nextLine()),
                Double.parseDouble(sc.nextLine()),
                Double.parseDouble(sc.nextLine())
        );
        System.out.println(contestant);
    }

}


