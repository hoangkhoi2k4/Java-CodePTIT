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
public class UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int a = sc.nextInt();
            int cnt = 0;
            for(int i = 1; i <= Math.sqrt(a); i++){
                if(a % i == 0){
                    if(i % 2 == 0) cnt++;
                    if(a / i != i && (a / i) % 2 == 0) cnt++;
                }
            }
            System.out.println(cnt);
            t--;
        }
    }
}
