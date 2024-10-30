/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachMatHang;
import java.util.*;
import SapXepDanhSachMatHang.Merchandise;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Merchandise> a = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            a.add(new Merchandise(i,  sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        
        Collections.sort(a,new Comparator<Merchandise>(){
            @Override
            public int compare(Merchandise b, Merchandise c){
                double profit1 = b.getProfit();
                double profit2 = c.getProfit();
                return Double.compare(profit2, profit1);
            }
        });
        
        for(Merchandise x : a){
            System.out.println(x);
        }
    }
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37


