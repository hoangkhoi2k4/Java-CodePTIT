/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaoLopSinhVien;
import TaoLopSinhVien.SinhVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        SinhVien s=new SinhVien();
        s.input();
        s.setDiem(4, 8);
        s.output();
        System.out.println(s.getHoVaTen()+" "+s.getXepLoai());
    }
}
//123
//To an
//An
//12
//20
//True
//12
//10
//8