/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DangKiHinhThucGiangDay;

/**
 *
 * @author Hoang Van Khoi
 */
public class Lecture implements Comparable<Lecture>{
    private String id, name, lt, th;
    private int num;

    public Lecture(String id, String name,int num, String lt, String th) {
        this.id = id;
        this.name = name;
        this.lt = lt;
        this.th = th;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }

    
    
    @Override
    public int compareTo(Lecture o) {
        return this.id.compareTo(o.id);
    }
    

    @Override
    public String toString() {
        return id + " " + name + " " + num + " " + lt + " " + th;
    }
    
    
}
