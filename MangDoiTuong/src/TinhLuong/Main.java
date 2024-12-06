/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> m = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String x = sc.next();
            String y = sc.nextLine().trim();
            m.put(x, y);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Luong> a = new ArrayList<>();
        for(int i =  1; i <= n; i++){
            String ma = sc.nextLine();
            a.add(new Luong(ma, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), m.get(ma.substring(ma.length()-2, ma.length()))));
        }
        for(Luong x : a){
            System.out.println(x);
        }
    }
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24