/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Customer> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            a.add(new Customer(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(Customer x : a){
            System.out.println(x);
        }
    }
}

//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700