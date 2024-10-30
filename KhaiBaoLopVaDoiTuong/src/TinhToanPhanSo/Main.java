/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanPhanSo;
import java.util.*;
import TinhToanPhanSo.PhanSo;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo a =  new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b =  new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo to = new PhanSo(1L, 1L);
            to = a.Tong(a, b);
            to = to.Pow(to);
            System.out.print(to + " ");
            
            PhanSo res = new PhanSo(1L, 1L);
            res = res.Mul(a, b, to);
            System.out.println(res);
        }
    }
}


