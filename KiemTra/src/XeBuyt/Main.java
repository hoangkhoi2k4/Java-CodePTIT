/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XeBuyt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */

class Buyt{
    private String ma, hoTen;
    private Date ngayDi;
    private int soHieuTuyen, soLuotDi;
    private String kieuNgay;
    private int doanhThu;

    public Buyt(String hoTen, String ngayDi, int soHieuTuyen, int soLuotDi, String kieuNgay, int stt) throws ParseException {
        this.ma = "HN" + String.format("%01d", soHieuTuyen) + String.format("%02d", stt);
        this.hoTen = hoTen;
        SimpleDateFormat fo = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDi = fo.parse(ngayDi);
        this.soHieuTuyen = soHieuTuyen;
        this.soLuotDi = soLuotDi;
        this.kieuNgay = kieuNgay;
        this.doanhThu = tinhDoanhThu();
    }
    private int tinhDoanhThu(){
        int doanhThuCoBan;
        if(soLuotDi < 5){
            doanhThuCoBan = soLuotDi * 800;
        } else if(soLuotDi <= 10){
            doanhThuCoBan = soLuotDi * 780;
        } else {
            doanhThuCoBan = soLuotDi * 750;
        }
        
        if(kieuNgay.equals("nghi")){
            return (int)Math.round(doanhThuCoBan * 1.1);
        } else if(kieuNgay.equals("le")){
            return (int)Math.round(doanhThuCoBan * 1.2);
        } 
        return doanhThuCoBan;
    }

    @Override
    public String toString() {
        SimpleDateFormat fo = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + hoTen + " " + fo.format(ngayDi) + " " + soHieuTuyen + " " + soLuotDi + " " + kieuNgay + " " + doanhThu;
    }
    
}

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Buyt> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ds.add(new Buyt(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), i));
        }
        for(Buyt x : ds){
            System.out.println(x);
        }
    }
}
//2
//To An An
//12/09/2023
//21
//9
//thuong
//do trung tuan
//01/10/2023
//2
//12
//le
