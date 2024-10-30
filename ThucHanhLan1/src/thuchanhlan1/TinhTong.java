/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlan1;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            try{
                sum += Integer.parseInt(sc.next());
            } catch(Exception e){
                
            }
        }
        System.out.println(sum);
    }
}
