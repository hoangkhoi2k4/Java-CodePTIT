/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhcobanjava;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author Hoang Van Khoi
 */
public class BoiSoChungNhoNhat {
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        return gcd(b, a.mod(b));
    }
    public static BigInteger lcm(BigInteger a, BigInteger b){
        return a.multiply(b).divide(gcd(a, b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(lcm(a, b));
        }
    }
}
