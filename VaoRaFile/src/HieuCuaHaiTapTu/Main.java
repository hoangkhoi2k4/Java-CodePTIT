/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HieuCuaHaiTapTu;

import java.io.IOException;


/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) throws IOException {
         WordSet s1 = new WordSet("DATA1.in");
         WordSet s2 = new WordSet("DATA2.in");
         System.out.println(s1.difference(s2));
         System.out.println(s2.difference(s1));
     }
}
