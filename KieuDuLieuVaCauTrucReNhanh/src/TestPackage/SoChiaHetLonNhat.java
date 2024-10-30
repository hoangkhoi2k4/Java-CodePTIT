/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */

/*
So lon nhat khong vuot qua a sao cho chia het cho b
*/
public class SoChiaHetLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong(); b = sc.nextLong();
        long res = (long)(a/b) * b;
        System.out.println(res);
    }
}

/*
INPUT:
19 5
OUTPUT:
15
*/
