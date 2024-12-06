
package object.j04004_tongPhanSo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction f2 = new Fraction(sc.nextLong(), sc.nextLong());
        System.out.println(f1.add(f2));
    }

}
