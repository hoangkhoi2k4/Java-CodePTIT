/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaoLopTour;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Tour> a = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            sc.nextLine();
            String tmp = String.valueOf(i);
            while(tmp.length() < 3){
                tmp = "0" + tmp;
            }
            a.add(new Tour(tmp,  sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble()));
        }
        
     
        for(Tour x : a){
            System.out.println(x);
        }
    }
 
}
//2
//30/04/2023
//04/05/2023
//4
//500
//27/08/2023
//02/04/2023
//20
//500