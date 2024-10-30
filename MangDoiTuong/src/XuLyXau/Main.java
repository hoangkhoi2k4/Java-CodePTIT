/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyXau;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Xau x=new Xau();
        String st=in.nextLine();
        System.out.println(x.isCodeValid(st));
        st=in.nextLine();
        System.out.println(x.isBillCode(st));
    }
}
//b22dccn123
//N22ptit34
//B22dccnAT123
//N223ptit345