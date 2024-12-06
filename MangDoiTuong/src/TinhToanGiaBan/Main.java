/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanGiaBan;

import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            a.add(new DonHang(sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }
        
        for(DonHang x : a){
            System.out.println(x);
        }
    }
}
//2
//TTVC 400 300
//CCAK 200 200