/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        
        ArrayList<Mon> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new Mon(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        
        Collections.sort(arr, new Comparator<Mon>(){
            @Override
            public int compare(Mon a, Mon b){
                return a.getName().compareTo(b.getName());
            }
        });
        
        for(Mon a : arr){
            System.out.println(a);
        }
    }
}
