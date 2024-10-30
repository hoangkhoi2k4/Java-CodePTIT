/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

import static java.lang.Math.*;
import java.util.Scanner;


/**
 *
 * @author Hoang Van Khoi
 */
public class SoNhoThu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d, e;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();
        e = sc.nextLong();
        long min1 = a;
        if(min1 > b) min1 = b;
        if(min1 > c) min1 = c;
        if(min1 > d) min1 = d;
        if(min1 > e) min1 = e;
        
        if(min1 == a){
            System.out.print(Math.min(Math.min(b, c), Math.min(d,e)));
        } else if(min1 == b){
            System.out.print(Math.min(Math.min(a, c), Math.min(d,e)));
        } else if(min1 == c){
            System.out.print(Math.min(Math.min(a, b), Math.min(d,e)));
        }
         else if(min1 == d){
            System.out.print(Math.min(Math.min(a, c), Math.min(b,e)));
        } else {
             System.out.print(Math.min(Math.min(a, c), Math.min(d,b)));
        }
        
    }
}
