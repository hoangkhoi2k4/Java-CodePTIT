/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa1;

import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> clb = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String id = sc.nextLine();
            CLB x = new CLB(id, sc.nextLine(), Integer.parseInt(sc.nextLine()));
            clb.add(x);
            map.put(id, i);
        }
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> res = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] x = (sc.nextLine()).split("\\s+");
            String idCLB = x[0].substring(1, 3);
            int sl = Integer.parseInt(x[1]);
            ans.add(idCLB);
            int tien = 0;
            String tenCLB = "";
            for (int j = 0; j < t; j++) {
                int pos = map.get(idCLB);
                if (idCLB.equals(clb.get(pos).getMa())) {
                    tien = clb.get(pos).getGia() * sl;
                    tenCLB = clb.get(pos).getTen();
                    break;
                }
            }
            System.out.println(x[0] + " " + tenCLB + " " + tien);
        }
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000