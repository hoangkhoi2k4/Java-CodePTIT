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
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            s = s.trim();
            if(s.equals("END")) break;
            String[] arr = s.split("\\s+");
            String res = "";
            for(String x : arr){
                res = res + x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
            res = res.trim();
            System.out.println(res);
        }
    }
}
