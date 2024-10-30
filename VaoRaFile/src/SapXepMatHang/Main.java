/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepMatHang;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        
        int  n = sc.nextInt();
        ArrayList<Merchandise> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            String id = String.valueOf(i);
            while(id.length() < 2) {
                id = "0" + id;
            }
            arr.add(new Merchandise("MH" + id, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        
        Collections.sort(arr, new Comparator<Merchandise>(){
            @Override
            public int compare(Merchandise a, Merchandise b){
                return Double.compare(b.getProfit(), a.getProfit());
            }
        });
        
        for(Merchandise a : arr){
            System.out.println(a);
        }
    }
}
