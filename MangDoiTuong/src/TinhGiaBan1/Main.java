/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGiaBan1;

import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            a.add(new MatHang(String.format("MH%02d", i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(MatHang x : a){
            System.out.println(x);
        }
    }
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430