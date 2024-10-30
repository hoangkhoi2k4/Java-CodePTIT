/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepHangHocSinh;

/**
 *
 * @author Hoang Van Khoi
 */
public class Student {
    private String id, name;
    private double diemTB, rank;

    public Student() {
    }

    public Student(String id, String name, double diemTB) {
        this.id = id;
        this.name = name;
        this.diemTB = diemTB;
    }

    public String getMaHS() {
        return id;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setXepHang(double rank) {
        this.rank = rank;
    }

    public double getXepHang() {
        return rank;
    }

    public String xepLoai() {
        if (this.diemTB >= 9)
            return "Gioi";
        else if (this.diemTB >= 7)
            return "Kha";
        else if (this.diemTB >= 5)
            return "Trung Binh";
        else return "Yeu";
    }

    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.1f", this.diemTB) + " " + xepLoai() + " " + String.format("%.0f", this.rank);
    }
}
