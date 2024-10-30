/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoanhNghiep;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        ArrayList<List> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new List(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        sc.close();
        Collections.sort(arr, new Comparator<List>(){
            @Override
            public int compare(List a, List b){
                 return a.getId().compareTo(b.getId());
            }
        });
        
        for(List x : arr){
            System.out.println(x);
        }
    }
}
