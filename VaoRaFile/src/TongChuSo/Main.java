/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TongChuSo;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static int sum(String s) {
        int res = 0;
        for (char x : s.toCharArray())
            res += (x - '0');
        return res;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>)ois.readObject();
        for (String s : a) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
           String res = "";
           for (Character x : s.toCharArray()) {
               if (Character.isDigit(x)) {
                   res += x;
               }
           }
           BigInteger x = new BigInteger(res);
           System.out.println(x.toString() + " " + sum(res));
        }
    }
}
