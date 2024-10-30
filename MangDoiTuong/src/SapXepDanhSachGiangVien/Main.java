/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachGiangVien;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lecturer> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            arr.add(new Lecturer(i, sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(arr, new Comparator<Lecturer>(){
            @Override
            public int compare(Lecturer a, Lecturer b){
                if(a.getName() == b.getName()){
                    return a.getId().compareTo(b.getId());
                }
                return a.getName().compareTo(b.getName());
            }
        });
        
        for(Lecturer x : arr){
            System.out.println(x);
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin