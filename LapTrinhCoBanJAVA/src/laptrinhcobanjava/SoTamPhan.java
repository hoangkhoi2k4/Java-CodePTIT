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
public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t-- > 0){
            String n = sc.nextLine();
            boolean check = true;
            for(int i = 0; i < n.length(); i++){
                if(n.charAt(i) != '0' && n.charAt(i) != '1' && n.charAt(i) != '2'){
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
