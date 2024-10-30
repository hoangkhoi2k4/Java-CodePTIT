/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlan1;

import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            s = s.trim();
            if(s.equals("END")) {
                break;
            }
            arr.add(s);
        }
        
        for(String x : arr){
            String res = "";
            String[] words = x.split("\\s+");
            for(String w : words){
                res += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " ";
            }
            System.out.println(res.trim());
        }
    }
}
