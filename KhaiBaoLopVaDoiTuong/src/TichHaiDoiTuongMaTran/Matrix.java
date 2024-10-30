/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TichHaiDoiTuongMaTran;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
class Matrix {
    private int[][] a;
    private int x, y;

    public Matrix(int n, int m) {
        a = new int[n][m];
        x = n;
        y = m;
    }
    
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix mul(Matrix b){
        Matrix res = new Matrix(this.x, b.y);
        for(int i = 0; i < this.x; i++){
            for(int j = 0; j < b.y; j++){
                res.a[i][j] = 0;
                for(int k = 0 ; k < b.x; k++){
                    res.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                res += String.valueOf(a[i][j]) + " ";
            }
            if(i != x - 1){
                res += "\n";
            }
        }
        return res;
    }
    
            
}
