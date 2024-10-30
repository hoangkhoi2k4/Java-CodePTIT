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
class IntSet {
    private TreeSet<Integer> s;

    public IntSet(int a[]) {
        s = new TreeSet<>();
        if(a != null){
            for(int i = 0; i < a.length; i++){
                s.add(a[i]);
            }
        }
    }
    
    public IntSet union(IntSet a){
        IntSet res = new IntSet(null);
        for(Integer x : a.s){
            res.s.add(x);
        }
        for(Integer x : this.s){
            res.s.add(x);
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for(Integer x : this.s){
            res += String.valueOf(x) + " " ;
        }
        return res.trim();
    }
    
}
