/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopInsert;

import java.util.TreeSet;

/**
 *
 * @author Hoang Van Khoi
 */
public class Intset {
    private TreeSet<Integer> a;

    public Intset(int a[], int n) {
        this.a = new TreeSet<>();
        for(int i = 0; i < n; i++){
            this.a.add(a[i]);
        }
    }
    
    
    public void Union(Intset b){
        for(Integer x : b.a){
            this.a.add(x);
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(int x : a){
            res += x + " ";
        }
        res = res.trim();
        return res;
    }
    
    
}
