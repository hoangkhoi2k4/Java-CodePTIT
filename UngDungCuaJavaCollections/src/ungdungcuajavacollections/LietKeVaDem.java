/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ungdungcuajavacollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class LietKeVaDem {
    public static boolean check(String s) {
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if ((s.charAt(i) - '0') > (s.charAt(i + 1) - '0')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new File("choi.in"));
        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String x = sc.nextLine().trim();
            String[] w = x.split("\\s+");
            for (String tmp : w) {
                if (check(tmp)) {
                    m.put(tmp, m.getOrDefault(tmp, 0) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(m.entrySet());
        list.sort((e1, e2) -> {
            if (e2.getValue().equals(e1.getValue())) {
                return 0;  
            }
            return e2.getValue() - e1.getValue();  
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

