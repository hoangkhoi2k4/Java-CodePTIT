/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoNganh;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String x = sc.nextLine().toUpperCase();
            String ma = "" + x.charAt(0);
            
            System.out.println("DANH SACH SINH VIEN NGANH " + x +":");
            for(Student i : arr){
                if(ma.equals(i.getId().substring(5, 6))){
                    if(i.getId().substring(5, 6).equals("K") || i.getId().substring(5, 6).equals("V") || i.getId().substring(5, 6).equals("D")){
                        System.out.println(i);
                    }
                    else if(!i.getClassRoom().equals("E")){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//Cong nghe