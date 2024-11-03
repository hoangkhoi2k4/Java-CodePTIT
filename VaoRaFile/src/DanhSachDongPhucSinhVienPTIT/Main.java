/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDongPhucSinhVienPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        TreeMap<String, Student> map = new TreeMap<>();
        for(int i = 1; i <= n; i++){
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()); 
            map.put(student.getId(), student);
        }
        sc = new Scanner(new File("DANGKY.in"));
        while(sc.hasNext()){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            map.get(tmp[0]).setSize(tmp[1]);
        }
        sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        arr.addAll(map.values());
        for(int i = 1; i <= n; i++) {
            String gender = sc.next();
            String size = sc.next();
            
            System.out.println("DANH SACH SINH VIEN " + gender.toUpperCase() + " DANG KY SIZE " + size);
            for(Student e : arr) {
                if(e.getGender().equals(gender) && e.getSize().equals(size)){
                    System.out.println(e);
                }
            }
        }
        
        sc.close();
    }
}
