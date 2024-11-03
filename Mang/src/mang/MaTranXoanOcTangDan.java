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
public class MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        Integer[] x = new Integer[n * n];
        int[][] a = new int[n][n];
        
        for(int i = 0;  i < n * n ; i++){
               x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        
        int top = 0, bot = n - 1, left = 0, right = n - 1;
        while (top <= bot && left <= right) {
            for (int i = left; i <= right; i++)
                a[top][i] = x[k++];

            top++;

            for (int i = top; i <= bot; i++)
                a[i][right] = x[k++];

            right--;

            if (top <= bot) {
                for (int i = right; i >= left; i--)
                    a[bot][i] = x[k++];

                bot--;
            }

            if (left <= right) {
                for (int i = bot; i >= top; i--)
                    a[i][left] = x[k++];

                left++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
