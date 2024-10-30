/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */

class SinhVien {
    private String id, name;
    private double d1, d2, d3;
    
    public SinhVien(){
        
    }
    
    public void input(Scanner sc){
        id = sc.nextLine();
        name = sc.nextLine();
        d1 =sc.nextDouble();
        d2 =sc.nextDouble();
        d3 =sc.nextDouble();
    }
    
    public String xepLoai(){
        double tb = (d1 + d2 + d3)/3;
        if(tb >= 0 && tb < 5){
            return "yeu";
        } else if(tb < 6.5){
            return "trung binh";
        }
         else if(tb < 8){
            return "kha";
        }
         else if(tb <= 10){
            return "gioi";
        } else {
             return "khong xep hang";
        }
    }
    
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getXL(){
        return xepLoai();
    }
    public void out(){
        System.out.println(id + " " + name + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " " + String.format("%.1f", d3));
    }
}

class QLSV{
    private List<SinhVien> a;
    
    public QLSV(){
        a = new ArrayList();
    }
    
    public void nhap(Scanner sc){
        sc.nextLine();
        SinhVien x = new SinhVien();
        x.input(sc);
        a.add(x);
    }
    
    public List<SinhVien> getList(){
        return a;
    }
    
    public void out(List<SinhVien> arr){
        Scanner sc = new Scanner(System.in);
        for(SinhVien x : arr){
            x.out();
        }
        System.out.println("");
        
    }
    
    public SinhVien timMa(String ma){
        for(SinhVien x : a){
            if(x.getId().equals(ma)){
                return x;
            }
        }
        return null;
    }
    public List<SinhVien> timTen(String name){
        List<SinhVien> res = new ArrayList();
        for(SinhVien x : a){
            if(x.getName().equals(name)){
                res.add(x);
            }
        }
        return res;
    }
    public List<SinhVien> timXL(String XL){
        List<SinhVien> res = new ArrayList();
        for(SinhVien x : a){
            if(x.getXL().equals(XL)){
                res.add(x);
            }
        }
        return res;
    }
    
    
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV qlsv = new QLSV();
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhap 1 sinh vien");
            System.out.println("2. In ra danh sach sinh vien");
            System.out.println("3. Tim sinh vien theo ma");
            System.out.println("4. Tim sinh vien theo ten");
            System.out.println("5. Tim sinh vien theo xep loai");
            System.out.println("0. thoat");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    qlsv.nhap(sc);
                    break;
                case 2:
                    qlsv.out(qlsv.getList());
                    break;
                case 3:
                    sc.nextLine();
                    String ma = sc.nextLine();
                    SinhVien svMa = qlsv.timMa(ma);
                    if (svMa != null) {
                        svMa.out();
                    } else {
                        System.out.println("Khong tim thay sinh vien theo ma: " + ma);
                    }
                    break;
                case 4:
                    sc.nextLine();
                    String ten = sc.nextLine();
                    List<SinhVien> dsTen = qlsv.timTen(ten);
                    if (!dsTen.isEmpty()) {
                        for (SinhVien sv : dsTen) {
                            sv.out();
                        }
                    } else {
                        System.out.println("Khong tim thay sinh vien theo ten " + ten);
                    }
                    break;
                case 5:
                    sc.nextLine();
                    String xl = sc.nextLine();
                    List<SinhVien> dsXL = qlsv.timXL(xl);
                    if (!dsXL.isEmpty()) {
                        for (SinhVien sv : dsXL) {
                            sv.out();
                        }
                    } else {
                        System.out.println("Khong tim thay sinh vien theo xep loai: " + xl);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);
    }
}
