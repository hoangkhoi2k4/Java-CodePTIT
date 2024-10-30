/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhThuNhapGiaoVien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Teacher {
    private String id, name;
    private long luongcb, heso, pc;
    
    public Teacher(String id, String name, long luongcb){
        this.id = id;
        this.name = name;
        this.luongcb = luongcb;
    }
    
    public long getHeSo(){
        long tmp = 0;
        tmp = tmp*10 + this.id.charAt(this.id.length() - 2) - '0';
        tmp = tmp*10 + this.id.charAt(this.id.length() - 1) - '0';
        this.heso = tmp;
        return this.heso;
    }
    
    public void check(){
        if(this.id.charAt(1) == 'T'){
            this.pc = 2000000;
        } else if(this.id.charAt(1) == 'P'){
            this.pc = 900000;
        } else if(this.id.charAt(1) == 'V'){
            this.pc = 500000;
        }
    }
    
    @Override
    public String toString(){
        this.check();
        return this.id + " " + this.name + " " + this.getHeSo() + " " + this.pc + " " + (this.pc + this.getHeSo()*this.luongcb);
    }
    
}
