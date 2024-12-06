
package object.j04018_soPhuc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Complex c1 = new Complex(sc.nextInt(), sc.nextInt());
            Complex c2 = new Complex(sc.nextInt(), sc.nextInt());
            
            Complex sum = c1.add(c2);
            System.out.println(sum.mul(c1) + ", " + sum.mul(sum));
        }
    }

}
