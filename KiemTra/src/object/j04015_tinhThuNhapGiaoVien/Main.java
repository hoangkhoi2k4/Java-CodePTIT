
package object.j04015_tinhThuNhapGiaoVien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher(
                sc.nextLine(),
                sc.nextLine(),
                sc.nextInt()
        );
        System.out.println(teacher);
    }

}
