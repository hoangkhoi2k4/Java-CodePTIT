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
public class PhanTichThuaSoNguyenTo {
    public static void phanTich(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            int cnt = 0;
            if(n % i == 0){
                while(n % i == 0){
                    cnt++;
                    n /= i;
                }
                System.out.print(i + "(" + cnt + ")" + " ");
            }
        }
        if(n > 1){
            System.out.print(n + "(1)");
            
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <= t; test++){
            int n = sc.nextInt();
            System.out.print("Test " + test + ": ");
            phanTich(n);
        }
    }
}
