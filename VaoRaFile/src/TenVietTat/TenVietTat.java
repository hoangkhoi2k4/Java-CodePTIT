/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TenVietTat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
class Name{
    private String name, fName, lName, vt;
    public Name(String s){
        name = s;
        String[] words = s.split("\\s+");
        fName = words[0];
        lName = words[words.length - 1];
        vt = "";
        for(String x : words){
            vt = vt + x.substring(0, 1) + ".";
        }
        vt = vt.substring(0, vt.length() - 1);
    }
    
    public String getFName(){
        return fName;
    }
    
    public String getLName(){
        return lName;
    }
    public String getVT(){
        return vt;
    }
    @Override
    public String toString(){
        return name;
    }
}

public class TenVietTat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Name> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            arr.add(new Name(sc.nextLine()));
        }
        
        Collections.sort(arr,new Comparator<Name>(){
            @Override
            public int compare(Name a, Name b){
                if(a.getLName().equals(b.getLName())){
                    return a.getFName().compareTo(b.getFName());
                }
                return a.getLName().compareTo(b.getLName());
            }
        });

        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String x = sc.nextLine();
            for(Name i : arr){
                boolean check = false;
                if(x.length() == i.getVT().length()){
                   check = true;
                    for(int j = 0; j < x.length(); j++){
                        if(x.charAt(j) == '*'){
                            continue;
                        }
                        if(x.charAt(j) != i.getVT().charAt(j)){
                            check = false;
                            break;
                        }
                    }
                }
                if(check ){
                    System.out.println(i);
                }
                
            }
        }
    }
}
