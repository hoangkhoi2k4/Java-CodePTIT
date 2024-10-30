/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TongHaiMaTran;
import java.util.*;
/**
 *
 * @author Hoang Van Khoi
 */
public class Matran {
    Scanner sc = new Scanner(System.in);
    private int n;
    private int[][] a;
    
    public Matran(){
        
    }
    public Matran(int n){
        this.n = n;
        a = new int[this.n][this.n];
    }
    
    public int[][] getMatran(){
        return this.a;
    }
    public int getKT(){
        return this.n;
    }
    public void input(Scanner sc){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public void out(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public Matran tong(int[][] b){
        Matran res = new Matran(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res.a[i][j] = this.a[i][j] + b[i][j];
            }
        }
        return res;
    }
}
