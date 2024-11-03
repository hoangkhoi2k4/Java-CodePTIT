/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Room> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            a.add(new Room(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(a);
        for(Room x : a){
            System.out.println(x);
        }
    }
}
