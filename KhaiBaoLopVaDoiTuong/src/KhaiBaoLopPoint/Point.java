/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopPoint;
import java.lang.Math;
/**
 *
 * @author Hoang Van Khoi
 */

public class Point{
    private double x, y;
    
    public Point(){}
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double distance(Point secondPoint){
        double ans = Math.sqrt((this.x - secondPoint.x) * (this.x - secondPoint.x) + (this.y - secondPoint.y) * (this.y - secondPoint.y));
        return ans;
    }
    
    public double distance(Point p1, Point p2){
        double ans = Math.sqrt((p1.x - p2.x) *(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
        return ans;
    }
     @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
