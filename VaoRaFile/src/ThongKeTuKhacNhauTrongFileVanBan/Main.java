/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKeTuKhacNhauTrongFileVanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Map<String, Integer> w = new HashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().toLowerCase();
            Pattern p = Pattern.compile("[a-z0-9]+");
            Matcher m = p.matcher(input);
            while (m.find()) {
                String word = m.group();
                w.put(word, w.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> s = new ArrayList<>(w.entrySet());
        s.sort((e1, e2) -> {
            if (!e1.getValue().equals(e2.getValue())) {
                return e2.getValue() - e1.getValue(); 
            }
            return e1.getKey().compareTo(e2.getKey()); 
        });

        for (Map.Entry<String, Integer> entry : s) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
