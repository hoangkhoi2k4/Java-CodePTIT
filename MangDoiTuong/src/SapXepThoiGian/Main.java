/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepThoiGian;
import java.util.*;
import SapXepThoiGian.Time;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            a.add(new Time(hour, minute, second));
        }
        
        Collections.sort(a);
        
        for(Time x : a){
            System.out.println(x);
        }
    }
}
