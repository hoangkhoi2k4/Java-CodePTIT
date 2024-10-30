/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepTheoMaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return a.getId().compareTo(b.getId());
            }
        });
        
        for(Student x : arr){
            System.out.println(x);
        }
    } 
}
