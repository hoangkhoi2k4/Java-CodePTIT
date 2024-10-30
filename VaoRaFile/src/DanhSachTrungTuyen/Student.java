/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachTrungTuyen;

/**
 *
 * @author Hoang Van Khoi
 */
import java.util.Arrays;
import java.util.stream.Collectors;


public class Student {
    private String id;
    private String name;
    private double math, physics, chemistry;

    public Student(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        this.name = this.formatName(name);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return this.id + " "
                + this.name + " "
                + formatDouble(this.getPriorityScore()) + " "
                + formatDouble(this.getScore()) + " ";
    }
    
    private String formatDouble(double val) {
        String res = String.valueOf(val);
        if(res.endsWith(".0")) {
            return res.split("\\.")[0];
        }
        return String.format("%.1f", val);
    }
    
    private String formatName(String name) {
        return Arrays.stream(name.trim().split("\\s+"))
                .map(x -> x.substring(0, 1).toUpperCase()
                + x.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
    
    private double getPriorityScore() {
        switch (this.id.substring(0, 3)) {
            case "KV1":
                return 0.5;
            case "KV2":
                return 1.0;
            default:
                return 2.5;
        }
    }
    
    public double getScore() {
        return this.getPriorityScore() + 
                this.math * 2 + this.physics + this.chemistry;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMath() {
        return math;
    }

    public double getPhysics() {
        return physics;
    }

    public double getChemistry() {
        return chemistry;
    }
    
    
}