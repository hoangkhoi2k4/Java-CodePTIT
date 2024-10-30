/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class DayConCoTongNguyenTo {
    public static int n;
    public static Integer[] a = new Integer[20];
    public static ArrayList<Integer> v = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> res;
    
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void Try(int i, int sum) {
        if (snt(sum)) {
            res.add(new ArrayList<>(v)); 
        }
        if (i > n) {
            return;
        }
        for (int j = i; j <= n; j++) {
            v.add(a[j]);
            Try(j + 1, sum + a[j]);
            v.remove(v.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 1, n + 1, Collections.reverseOrder());

            res = new ArrayList<>(); 
            Try(1, 0);

            Collections.sort(res, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    int size = Math.min(o1.size(), o2.size());
                    for (int i = 0; i < size; i++) {
                        if (!o1.get(i).equals(o2.get(i))) {
                            return o1.get(i).compareTo(o2.get(i)); // Sắp xếp tăng dần
                        }
                    }
                    return o1.size() - o2.size();
                }
            });

            for (ArrayList<Integer> m : res) {
                for (Integer x : m) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
