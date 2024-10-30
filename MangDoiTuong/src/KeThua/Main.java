/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Oto o = new Oto("Yaris", "02/2023", 32000, 4, 1.5);
        o.setMa();
        System.out.println(o);

        XeTai t = new XeTai("Ranger", "10/2018", 16000, 3.5, true);
        t.setMa();
        System.out.println(t);
    }
}
