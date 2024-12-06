/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimViTriXauCon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("STRING.in"));
        
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s1 = sc.nextLine(); 
            String s2 = sc.nextLine(); 

            List<Integer> pos = find(s1, s2);
            if (!pos.isEmpty()) {
                for (int p : pos) {
                    System.out.print(p + " ");
                }
                System.out.println("");
            }
        }
        sc.close();
    }

    public static List<Integer> find(String s1, String s2) {
        List<Integer> pos = new ArrayList<>();
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            pos.add(index + 1); 
            index++; 
        }
        return pos;
    }
}
