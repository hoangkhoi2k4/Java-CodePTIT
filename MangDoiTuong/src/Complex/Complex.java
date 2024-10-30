/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Complex;

/**
 *
 * @author Hoang Van Khoi
 */
public class Complex {
    private int real, imaginary;
    
    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public int getReal(){
        return this.real;
    }
    public int getImaginary(){
        return this.imaginary;
    }
    
    public Complex add(Complex b) {
        return new Complex(this.real + b.real, this.imaginary + b.imaginary);
    }
    
     public Complex mul(Complex b) {
        int newReal = this.real * b.real - this.imaginary * b.imaginary;
        int newImaginary = this.real * b.imaginary + this.imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }
    
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return this.real + " + " + this.imaginary + "i";
        } else {
            return this.real + " - " + (-this.imaginary) + "i";
        }
    }
}
