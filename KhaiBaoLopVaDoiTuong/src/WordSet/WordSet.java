/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WordSet;

import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author Hoang Van Khoi
 */
class WordSet {
    private TreeSet<String> s;

    public WordSet(String x) {
        s = new TreeSet<>();
        String[] words = x.split("\\s+");
        for(int i = 0 ; i < words.length; i++){
            words[i] = words[i].toLowerCase();
        }
        s.addAll(Arrays.asList(words));
    }
    
    public WordSet union(WordSet a){
        WordSet u = new WordSet("");
        for(String x : this.s){
            u.s.add(x);
        }
        for(String x : a.s){
            u.s.add(x);
        }
        return u;
    }
    
    public WordSet intersection(WordSet a){
        WordSet i = new WordSet("");
        for(String x : this.s){
            if(a.s.contains(x)){
                i.s.add(x);
            }
        }
        return i;
    }
    
    @Override
    public String toString() {
        String res = "";
        for(String x : s){
            res += x + " ";
        }
        return res.trim();
    }
    
}
