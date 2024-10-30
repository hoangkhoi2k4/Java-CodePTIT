/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DongPhuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 1; i <= n; i++){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        ArrayList<DangKy> ar = new ArrayList<>();
        Scanner in = new Scanner(new File("DANGKY.in"));
        while(in.hasNext()){
            String s = in.nextLine();
            String words[] = s.split("\\s+");
            ar.add(new DangKy(words[0], words[1]));
            for(SinhVien x : arr){
                if(x.id.equals(words[0])){
                    x.size = words[1];
                }
            }
        }
        in.close();
        Scanner s = new Scanner(new File("TRUYVAN.in"));
        int q = Integer.parseInt(s.nextLine());
        while(q-- > 0){
            String gender = s.next();
            String size = s.next();
            System.out.println("DANH SACH SINH VIEN " + gender + " DANG KI SIZE " + size);
            for(SinhVien x : arr){
                if(x.gender.equals(gender) && x.size.equals(size)){
                    System.out.println(x);
                }
            }
        }
        s.close();
    }
}
