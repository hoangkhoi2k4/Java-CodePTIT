/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaorafile;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> s = new TreeSet<>();
        while(sc.hasNext()){
            String a = sc.nextLine().toLowerCase();
            String[] arr = a.split("\\s+");
            for(String x : arr){
                s.add(x);
            }
        }
        for(String x : s){
            System.out.println(x);
        }
    }
}
