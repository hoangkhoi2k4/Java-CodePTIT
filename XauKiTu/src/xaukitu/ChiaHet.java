/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author Hoang Van Khoi
 */
public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.compareTo(b) > 0){
                if(a.mod(b) == BigInteger.valueOf(0)){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if(b.mod(a) == BigInteger.valueOf(0)){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            
            
        }
    }
}
