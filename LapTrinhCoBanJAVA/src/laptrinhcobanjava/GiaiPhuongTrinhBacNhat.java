/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhcobanjava;
import java.util.Scanner;
/**
 *
 * @author Hoang Van Khoi
 */
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 0 && b != 0){
            System.out.println("VN");
        } else if(a == 0 && b == 0){
            System.out.println("VSN");
        } else {
            double x = (double)b/a;
            System.out.printf("%.2f" , -x);
        }
    }
    
}
