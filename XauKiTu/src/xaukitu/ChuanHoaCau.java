/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaukitu;

import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class ChuanHoaCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(); 
        while(sc.hasNext()){
            String s = sc.nextLine().toLowerCase();
            String[] w = s.trim().split("\\s+");
            String tmp = "";
            for(String x : w){
                tmp += x + " ";
            }
            tmp = tmp.trim();
            if(tmp.charAt(tmp.length() - 1) != '.' && tmp.charAt(tmp.length() - 1) != '!' && tmp.charAt(tmp.length() - 1) != '?'){
                tmp = tmp + ".";
            }
            if(tmp.charAt(tmp.length() - 2) == ' '){
                tmp = tmp.substring(0, tmp.length()-2) + tmp.substring(tmp.length() - 1);
            }
            tmp = tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
            arr.add(tmp);
        }
        for(String x : arr){
            System.out.println(x);
        }
    }
}
//Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet     Ke theo chuan quoc te.
//co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
//muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
//moi    CAC BAN danG ky     thaM giA !