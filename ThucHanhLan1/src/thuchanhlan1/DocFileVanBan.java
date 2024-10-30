/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlan1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String x = sc.nextLine();
            System.out.println(x);
        }
    }
}
