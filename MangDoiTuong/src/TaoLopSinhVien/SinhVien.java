/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaoLopSinhVien;

/**
 *
 * @author Hoang Van Khoi
 */

import java.util.*;
public class SinhVien {
    private String ma, hodem, name;
    private int tuoi;
    private boolean gt; // true: nam, false: nu
    private double diem1, diem2;
    
    public SinhVien(){
        this.ma = this.name = this.hodem = "";
        this.diem1 = this.diem2 = 0d;
        this.gt = false;
        this.tuoi = 0;
    }
    
    public void setMaSV(int number){
        this.ma = "D22DCCN" + String.valueOf(number);
    }
    
    public void setDiem(double diem1, double diem2){
        this.diem1  = diem1;
        this.diem2  = diem2;
    }
    
    public String getHoVaTen(){
        return this.hodem + " " + this.name;
    }
    
    public double getGPA(){
        return (this.diem1 + this.diem2 * 2) / 3.0;
    }
    
    public String getXepLoai(){
        double gpa = this.getGPA();
        if(gpa < 5){
            return "yeu";
        } else if(gpa < 6.5){
            return "trung binh";
        } else if(gpa < 8){
            return "kha";
        } else if(gpa < 9){
            return "gioi";
        } else {
            return "xuat sac";
        }
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        // Nhập mã sinh viên
        int number;
        do {
            number = Integer.parseInt(sc.nextLine());
            if (number < 100 || number > 999) {
                System.out.println("nhap sai");
            }
        } while (number < 100 || number > 999);
        this.setMaSV(number);
        
        // Nhập họ và tên đệm
        this.hodem = sc.nextLine();
        
        // Nhập tên
        this.name = sc.nextLine();
        
        // Nhập tuổi
        do {
            this.tuoi = Integer.parseInt(sc.nextLine());
            if (this.tuoi < 18 || this.tuoi > 23) {
                System.out.println("nhap sai");
            }
        } while (this.tuoi < 18 || this.tuoi > 23);
        
        // Nhập giới tính
        this.gt = Boolean.parseBoolean(sc.nextLine());
        
        // Nhập điểm
        do {
            this.diem1 = Double.parseDouble(sc.nextLine());
            if (this.diem1 < 0 || this.diem1 > 10) {
                System.out.println("nhap sai");
            }
        } while (this.diem1 < 0 || this.diem1 > 10);
        
        do {
            this.diem2 = Double.parseDouble(sc.nextLine());
            if (this.diem2 < 0 || this.diem2 > 10) {
                System.out.println("nhap sai");
            }
        } while (this.diem2 < 0 || this.diem2 > 10);
    }
    
    public void output(){
        String gioiTinh = this.gt ? "nam" : "nu";
        System.out.printf("%s %s %d %s %.1f %s\n", this.ma, this.getHoVaTen(), this.tuoi, gioiTinh, this.getGPA(), this.getXepLoai());
    }

    public static void main(String[] args) {
        SinhVien s = new SinhVien();
        s.input();
        s.output();
        System.out.println(s.getHoVaTen() + " " + s.getXepLoai());
    }
}
