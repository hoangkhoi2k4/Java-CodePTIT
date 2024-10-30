/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopHinhChuNhat;
import KhaiBaoLopHinhChuNhat.Rectange;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            String z = sc.next();
            if(x <= 0 || y <= 0)
            {
                System.out.println("INVALID");
                return;
            }

//            Rectange rec = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
            Rectange rec = new Rectange(x, y, z);
            System.out.println((int)rec.findPerimeter() + " " + (int)rec.findArea() + " " + rec.getColor());
        }
        catch (Exception e)
        {
            System.out.println("INVALID");
        }
    }
}
