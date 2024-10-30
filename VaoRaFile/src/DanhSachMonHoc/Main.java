/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMonHoc;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws  FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<Subject>(){
            @Override
            public int compare(Subject a, Subject b){
                return a.getName().compareTo(b.getName());
            }
        });
        for(Subject x : arr){
            System.out.println(x);
        }
    }
}
