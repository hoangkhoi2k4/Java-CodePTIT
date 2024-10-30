/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Hoang Van Khoi
 */
public class SoXaCach {
    public static int n;
    public static int[] x = new int[100];
    public static boolean[] check = new boolean[100];
    public static void kiemTra(int len){
//        boolean check1 = true, check2 = true;
        for(int i = 1; i <= len - 1; i++){
            if(Math.abs(x[i] - x[i + 1]) <= 1){
                return;
            }
        }
        for(int i = 1; i <= len; i++){
            System.out.print(x[i]);
        }
        System.out.println("");
        
    }
    
    public static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(check[j] == false){
                x[i] = j;
                check[j] = true;
                if(i == n){
                    kiemTra(i);
                } else {
                    Try(i + 1);
                    
                }
                check[j] = false;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            for(int i = 0; i < 100; i++){
                check[i] = false;
            }
            Try(1);
        }
    }
}


//int n;
//string tmp = "";
//
//bool check(string a){
//	bool check1 = true, check2 = true;
//	for(int i = 0; i < a.length() - 1; i++){
//		if(abs((a[i] - '0') - (a[i+1] - '0')) <= 1) return false;
//	}
//	if(check1 && check2) return true;
//}
//
//
//int main(){
//	ios::sync_with_stdio(0); cin.tie(0);
//	int t; cin >> t;
//	while(t--){
//		cin >> n;
//		tmp.clear();
//		for(int i = 1; i <= n; i++){
//			tmp += to_string(i);
//		}
//		bool check1 = true;
//		while(next_permutation(tmp.begin(), tmp.end())){
//			if(check(tmp)){
//				cout << tmp << endl;
//				check1 = false;
//			} 
//		}
//		if(check1) cout << endl;
//	}
//	return 0;
//}