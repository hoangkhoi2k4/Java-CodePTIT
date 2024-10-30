/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeTheoThuTuXuatHien;
import java.io.File;
import java.util.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList) sc.readObject();
        Set<String> a = new HashSet<>();
        for(String x :  arr){
            x = x.trim();
            String[] words = x.split("\\s+");
            for(String tmp : words){
                a.add(tmp.toLowerCase());
            }
        }
        sc.close();
        Scanner in = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> b = new LinkedHashSet<>();
        while(in.hasNext()){
            String x = in.nextLine();
            x = x.trim();
            String[] words = x.split("\\s+");
            for(String tmp : words){
                b.add(tmp.toLowerCase());
            } 
        }
        in.close();
        for(String x : b){
            if(a.contains(x)){
                System.out.println(x);
            }
        }
    }
}
