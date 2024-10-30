/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangXepHang;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Rank> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new Rank(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<Rank>(){
            @Override
            public int compare(Rank a, Rank b){
                if(a.getC() == b.getC()){
                    if(a.getT() == b.getT()){
                        return a.getName().compareTo(b.getName());
                    }
                    return a.getT() - b.getT();
                }
                return b.getC() - a.getC();
            }
        });
        
        for(Rank x : arr){
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Nam
//168 601
//Tran Thi Ngoc
//168 600