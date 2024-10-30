/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */

class Pair{
    public int t, d;
    void ip(Scanner sc){
        t = sc.nextInt();
        d = sc.nextInt();
    }
}

public class XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Pair> v = new Vector<>();
        for(int i = 0 ; i < n; i++){
            Pair x = new Pair();
            x.ip(sc);
            v.add(x);
        }
        
        Collections.sort(v, new Comparator<Pair>(){
            @Override
             public int compare(Pair a, Pair b) {
                if (a.t > b.t) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (s < v.get(i).t) {
                s = v.get(i).t;
            }
            s += v.get(i).d;
        }
        System.out.println(s);
    }
}
