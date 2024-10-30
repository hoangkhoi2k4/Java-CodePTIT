/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimThuKhoaKyThi;
import java.util.*;
import TimThuKhoaKyThi.Student;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            a.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        
        double tong = Double.MIN_VALUE;
        for(Student x : a){
            tong = Math.max(x.getTong(), tong);
        }
        
        for(Student x : a){
            if(x.getTong() == tong){
                System.out.println(x);
            }
        }
    }
}
