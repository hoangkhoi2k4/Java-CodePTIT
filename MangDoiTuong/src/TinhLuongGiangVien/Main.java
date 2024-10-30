/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuongGiangVien;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Luong> a = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            sc.nextLine();
            String x = sc.nextLine();
            Double b= sc.nextDouble();
            sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            a.add(new Luong(i, x  , b , c, d));
        }
       
        for(Luong x : a){
            System.out.println(x);
        }
    }
}
//2
//To an An
//4.2
//B
//300
//Tran Van Tuan
//3.5
//C
//800