/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangThuNhapGiaoVien;
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
        HashMap<String, Integer> m = new HashMap<>();
        ArrayList<GiaoVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            m.put(ma.substring(0, 2), m.getOrDefault(ma.substring(0, 2), 0)+1);
            if(ma.substring(0, 2).equals("HT")){
                if(m.get(ma.substring(0, 2)) <= 1){
                    a.add(new GiaoVien(ma, sc.nextLine(), Integer.parseInt(sc.nextLine())));
                } else {
                    sc.nextLine();
                    sc.nextLine();
                }
            } else if(ma.substring(0, 2).equals("HP")){
                if(m.get(ma.substring(0, 2)) <= 2){
                    a.add(new GiaoVien(ma, sc.nextLine(), Integer.parseInt(sc.nextLine())));
                } else {
                    sc.nextLine();
                    sc.nextLine();
                }
            } else {
               a.add(new GiaoVien(ma, sc.nextLine(), Integer.parseInt(sc.nextLine())));                
            }
        }
        for(GiaoVien x : a){
            System.out.println(x);
        }
    }
}
//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000