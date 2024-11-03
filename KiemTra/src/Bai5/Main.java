/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class PTGT {
    private String ma;
    private String hang;
    private String ngayLanBanh;
    private double giaBan;
    private static int sMa = 1;

    // Constructor
    public PTGT(String hang, String ngayLanBanh, double giaBan) {
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.giaBan = giaBan;
        this.ma = generateMa(hang);
    }

    private String generateMa(String hang) {
        String code = hang.substring(0, 1).toUpperCase() + String.format("%03d", sMa);
        sMa++;
        return code;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getNamLanBanh() {
        String x = ngayLanBanh;
        return Integer.parseInt(x.substring(x.length() - 4, x.length()));
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + hang + " " + dateFormat.format(ngayLanBanh) + " " + giaBan;
    }
}

class QLPT {
    private List<PTGT> a;

    public QLPT() {
        a = new ArrayList<>();
    }

    public void nhap(Scanner scanner){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String hang = scanner.nextLine();
        Date ngayLanBanh;
        String x = scanner.nextLine();
        double giaBan = Double.parseDouble(scanner.nextLine());
        PTGT ptgt = new PTGT(hang, x, giaBan);
        a.add(ptgt);
        
       
    }

    public void tongTienTheoNam() {
        Map<Integer, Double> totalByYear = new TreeMap<>();
        for (PTGT ptgt : a) {
            int year = ptgt.getNamLanBanh();
            double giaBan = ptgt.getGiaBan();
            totalByYear.put(year, totalByYear.getOrDefault(year, 0.0) + giaBan);
        }

        for (Map.Entry<Integer, Double> entry : totalByYear.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLPT q=new QLPT();
        for (int i = 0; i < 4; i++) {
            q.nhap(in);
        }
        q.tongTienTheoNam();
    }
}

//yaris
//01/02/2020
//3000
//camry
//02/10/2020
//4000
//ranger
//01/23/2022
//1000
//Hyundai
//09/15/2022
//1500