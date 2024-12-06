
package object.j04014_tinhToanPhanSo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction c = Fraction.calcC(a, b);
            System.out.println(c + " " + Fraction.calcD(a, b, c));
        }
    }

}
