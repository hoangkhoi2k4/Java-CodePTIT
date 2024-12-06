
package object.j04002_khaiBaoLopHinhChuNhat;


public class Rectange {
    private double width, height;
    private String color;

    public Rectange() {
        this.height = 1;
        this.width = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea() {
        return height * width;
    }
    
    public double findPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return (int) findPerimeter() + " " + 
                (int) findArea() + " " + 
                color.substring(0, 1).toUpperCase() +
                color.substring(1).toLowerCase();
    }
}
