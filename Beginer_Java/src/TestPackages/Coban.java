/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackages;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Coban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kiTu = sc.nextLine().charAt(0);
        if(kiTu <= 'z' && kiTu >= 'a'){
            System.out.println("Ki tu in thuong!");
        } else if(kiTu <= 'Z' && kiTu >= 'A'){
            System.out.println("Ki tu in hoa");
        } else {
            System.out.println("Cac ki tu con lai");
        }
    }
}
