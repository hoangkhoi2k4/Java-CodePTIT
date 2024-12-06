
package object.j04002_khaiBaoLopHinhChuNhat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String color = sc.next();
        if(a <= 0 || b <= 0) {
            System.out.println("INVALID");
        } else {
            Rectange rectange = new Rectange(a, b, color);
            System.out.println(rectange);
        }
    }

}
