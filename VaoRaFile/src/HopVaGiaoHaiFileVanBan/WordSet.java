/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HopVaGiaoHaiFileVanBan;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class WordSet {
    private Set<String> s;

    public WordSet(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        s = new TreeSet<>();
        while(sc.hasNext()){
            String x = sc.nextLine();
            String[] words = x.split("\\s+");
            for(String tmp : words){
                s.add(tmp.toLowerCase());
            }
        }
    }
    
    public WordSet(){
        s = new TreeSet<>();
    }
    
    public WordSet union(WordSet a){
        WordSet res = new WordSet(); 
        for(String x :  this.s){
            res.s.add(x);
        }
        for(String x : a.s){
            res.s.add(x);
        }
        return res;
    }
    
    public WordSet intersection(WordSet a){
        WordSet res = new WordSet();
        for(String x : this.s){
            if(a.s.contains(x)){
                res.s.add(x);
            }
        }
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        for(String x : s){
            res += x + " ";
        }
        return res.trim();
    }
    
}
