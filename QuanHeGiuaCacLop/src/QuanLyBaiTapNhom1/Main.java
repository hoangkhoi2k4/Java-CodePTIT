/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBaiTapNhom1;

import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        HashMap<String, String> ma = new HashMap<>();
        for(int i = 1; i <= m; i++){
            ma.put(String.valueOf(i), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String nhom = sc.nextLine();
            System.out.println("DANH SACH NHOM " + nhom + ":");
            for(Student x : arr){
                if(x.getStt().equals(nhom)){
                    System.out.println(x);
                }
            }
            System.out.println("Bai tap dang ky: " + ma.get(nhom));
        }
    }
}


//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19
//1
//1