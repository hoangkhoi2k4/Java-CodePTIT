/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HieuCuaHaiTapTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Hoang Van Khoi
 */
class WordSet {
    private Set<String> s;

    public WordSet(String file) throws FileNotFoundException {
        s = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext()){
            String x = sc.nextLine().trim().toLowerCase();
            String[] w = x.split("\\s+");
            for(String str : w){
                s.add(str);
            }
        }
    }
    
    public WordSet(){
        s = new TreeSet<>();
    }
    
    public WordSet difference(WordSet b){
        WordSet res = new WordSet();
        for(String x : this.s){
            if(!b.s.contains(x)){
                res.s.add(x);
            }
        }
        return res;
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
