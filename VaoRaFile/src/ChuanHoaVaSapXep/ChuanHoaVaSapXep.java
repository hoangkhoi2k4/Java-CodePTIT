/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuanHoaVaSapXep;

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
    private String name, fName, lName, vt, dem;
    public Name(String s){
        s = s.trim();
        String[] a = s.split("\\s+");
        s = "";
        for(String x : a){
            s = s + x.substring(0, 1).toUpperCase() +  x.substring(1).toLowerCase() + " ";
        }
        s = s.trim();
        name = s;
        String[] words = s.split("\\s+");
        fName = words[0];
        lName = words[words.length - 1];
        vt = "";
        for(String x : words){
            vt = vt + x.substring(0, 1) + ".";
        }
        dem = words[1];
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
    public String getNameDem(){
        return dem;
    }
    @Override
    public String toString(){
        return name;
    }
}

public class ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(new Name(sc.nextLine()));
        }
        
        Collections.sort(arr,new Comparator<Name>(){
            @Override
            public int compare(Name a, Name b){
                if(a.getLName().equals(b.getLName())){
                    if(a.getFName().equals(b.getFName())){
                        return a.getNameDem().compareTo(b.getNameDem());
                    }
                    return a.getFName().compareTo(b.getFName());
                }
                return a.getLName().compareTo(b.getLName());
            }
        });
        for(Name x : arr){
            System.out.println(x);
        }
       
    }
}
