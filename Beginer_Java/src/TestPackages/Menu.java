/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackages;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----------MENU-----------");
            System.out.println("Option: ");
            System.out.println("1.Seclect1");
            System.out.println("2.Seclect2");
            System.out.println("3.Seclect3");
            System.out.println("0.Exit");
            int choice = sc.nextInt();
            boolean check = false;
            switch(choice){
                case 1:
                    System.out.println("Select 1");
                    break;
                case 2:
                    System.out.println("Select 2");
                    break;
                case 3:
                    System.out.println("Select 3");
                    break;
                case 0: 
                    check = true;
                    break;
                default:
                    System.out.println("Select value 1 -> 3");
            }
            if(check) break;
        }
    }
}
