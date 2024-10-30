/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopThiSinh;
import java.util.*;
import KhaiBaoLopThiSinh.Candidate;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Candidate a = new Candidate(sc.nextLine(), sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(a.Print());
    }
}
