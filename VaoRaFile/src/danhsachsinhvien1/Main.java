/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> arr = (ArrayList) sc.readObject();
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}
