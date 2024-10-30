/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopPair;
import java.util.*;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author Hoang Van Khoi
 */
class Pair<dataType1, dataType2> {
    private dataType1 fi;
    private dataType2 se;
    
    public Pair(dataType1 fi, dataType2 se){
        this.fi = fi;
        this.se = se;
    }
    
    public boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        return isPrime((Integer) this.fi) && isPrime((Integer) this.se);
    }
    
    @Override 
    public String toString(){
        return this.fi + " " + this.se;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
