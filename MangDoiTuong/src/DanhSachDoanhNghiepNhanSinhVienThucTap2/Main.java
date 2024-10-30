/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoanhNghiepNhanSinhVienThucTap2;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<List> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new List(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<List>(){
            @Override
            public int compare(List a, List b){
                if(a.getQuantity() == b.getQuantity()){
                    return a.getId().compareTo(b.getId());
                }
                return b.getQuantity() - a.getQuantity();
            }
        });
        int q = sc.nextInt();
        while(q-- > 0){
            int l = sc.nextInt(), r = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + l + " DEN "+ r +" SINH VIEN:");
            for(List x : arr){
                if(x.getQuantity() >= l && x.getQuantity() <= r)
                System.out.println(x);
            }
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
