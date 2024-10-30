/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGio;

/**
 *
 * @author Hoang Van Khoi
 */
public class Timer {
    private String id, name;
    private int time;
    
    public Timer(String id, String name, String vao, String ra){
        this.id = id;
        this.name = name;
        int vaoGio = Integer.parseInt(vao.substring(0, 2));
        int vaoPhut = Integer.parseInt(vao.substring(3));
        int raGio = Integer.parseInt(ra.substring(0, 2));
        int raPhut = Integer.parseInt(ra.substring(3));
        this.time = (raGio*60 - vaoGio*60) + (raPhut - vaoPhut);
    }
    
    public int getTime(){
        return this.time;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.time/60 + " gio " + (this.time - (this.time/60)*60) + " phut" ;
    }
}
