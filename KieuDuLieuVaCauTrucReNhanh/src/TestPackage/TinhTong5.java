/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class TinhTong5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2 == 0){
            System.out.println(n/2);
        } else {
            System.out.println((-n-1)/2);
        }
        
    }
}

/*
INPUT:
10000000f
OUTPUT:
5000000
*/
