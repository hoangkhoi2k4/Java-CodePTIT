/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSanPham2;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        ArrayList<Product> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<Product>(){
           @Override
           public int compare(Product a, Product b){
               if(a.getPrice() == b.getPrice()){
                   return a.getId().compareTo(b.getId());
               }
               return b.getPrice() - a.getPrice();
           }
        });
        for(Product a : arr){
            System.out.println(a);
        }
    }
}
