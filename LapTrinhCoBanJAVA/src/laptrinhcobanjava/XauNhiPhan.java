/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhcobanjava;
import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
public class XauNhiPhan {
    public static long[] Fibo = new long[93];
    
    public static int Find(int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= Fibo[n - 2]) return Find(n - 2, k);
        return Find(n - 1, k - Fibo[n-2]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Fibo[0] = 0; Fibo[1] = 1;
        for(int i = 2; i <= 92; i++){
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Find(n, k));
        }
    }
}
