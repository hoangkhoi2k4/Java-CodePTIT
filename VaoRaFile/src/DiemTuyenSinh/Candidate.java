/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiemTuyenSinh;

/**
 *
 * @author Hoang Van Khoi
 */
public class Candidate implements Comparable<Candidate> {
    private String id, ten, danToc, ketQua; 
    private double tong; 
    private int kv;
    
    public Candidate(int id, String name, double diem, String danToc, int kv){
        this.id = String.format("TS%02d", id);
        String[] words = name.trim().split("\\s+");
        this.ten = "";
        for(String x : words){
            this.ten += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.ten = this.ten.trim();
        this.danToc = danToc;
        this.kv = kv;
        this.tong = diem;
        if(kv == 1){
            this.tong += 1.5;
        } else if(kv == 2){
            this.tong += 1;
        }
        if(!danToc.equals("Kinh")){
            this.tong += 1.5;
        }
        if(this.tong >= 20.5){
            this.ketQua = "Do";
        } else {
            this.ketQua = "Truot";
        }
    }
    
    @Override
    public int compareTo(Candidate o) {
        if(this.tong == o.tong){
            return this.id.compareTo(o.id);
        }
        return Double.compare(o.tong, this.tong);
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + String.format("%.1f", tong) + " " + ketQua;
    }
}
