/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThoiGianOnlineLienTuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Time> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            arr.add(new Time(sc.nextLine(), sc.nextLine().trim(), sc.nextLine().trim(), formatter));
        }
        Collections.sort(arr);
        for(Time x : arr){
            System.out.println(x);
        }
    }
}
