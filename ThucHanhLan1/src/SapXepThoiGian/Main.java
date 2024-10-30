/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepThoiGian;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            arr.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<Time>(){
            @Override
            public int compare(Time a, Time b){
                if(a.getGio() == b.getGio()){
                    if(a.getPhut() == b.getPhut()){
                        return a.getGiay() - b.getGiay();
                    }
                    return a.getPhut() - b.getPhut();
                }
                return a.getGio() - b.getGio();
            }
        });
        for(Time a : arr){
            System.out.println(a);
        }
    }
}
//3
//11 20 20
//14 20 14
//11 15 12