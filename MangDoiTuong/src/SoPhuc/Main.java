/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoPhuc;

import java.util.Scanner;

/**
 *
 * @author Hoang Van Khoi
 */
class Complex{
    private int real, imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    
    public Complex add(Complex b){
        return new Complex(this.real + b.real, this.imaginary + b.imaginary);
    }
    
    public Complex mul(Complex b){
        int newReal = this.real * b.real - this.imaginary * b.imaginary;
        int newImaginary = this.real * b.imaginary + this.imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if(imaginary >= 0){
            return  real + " + " + imaginary + 'i';
        } else{
            return  real + " - " + (-imaginary) + 'i';
        }
        
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Complex a = new Complex(sc.nextInt(), sc.nextInt());
            Complex b = new Complex(sc.nextInt(), sc.nextInt());
            Complex c = a.add(b).mul(a);
            Complex d = (a.add(b));
            d = d.mul(d);
            System.out.println(c + " " + d);
        }
    }
}
