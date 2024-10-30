/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopInset2;
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
    
    public IntSet intersection(IntSet a){
        IntSet res = new IntSet(null);
        for(Integer x : a.s){
            if(this.s.contains(x)){
                res.s.add(x);
            }
            
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
