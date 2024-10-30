/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhcobanjava;
import java.util.Scanner;

public class HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;
        x1 = sc.nextInt(); y1 = sc.nextInt();
        x2 = sc.nextInt(); y2 = sc.nextInt();
        x3 = sc.nextInt(); y3 = sc.nextInt();
        x4 = sc.nextInt(); y4 = sc.nextInt();
        
        // Tìm tọa độ của hình chữ nhật bao phủ cả hai hình chữ nhật
        int left = Math.min(x1, x3);
        int right = Math.max(x2, x4);
        int bottom = Math.min(y1, y3);
        int top = Math.max(y2, y4);
        
        // Tính cạnh của hình vuông bao phủ
        int side = Math.max(right - left, top - bottom);
        
        // Tính diện tích của hình vuông
        int area = side * side;
        
        System.out.println(area);
    }
}