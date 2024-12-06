/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;

/**
 *
 * @author Hoang Van Khoi
 */
public class Customer {
    private String ma;
    private int heSo, thanhTien, phuTroi, tong;

    public Customer(int ma,String loai, int chiSoCu, int chiSoMoi) {
        this.ma = String.format("KH%02d", ma);
        if(loai.equals("KD")){
            heSo = 3;
        } else if(loai.equals("NN")){
            heSo = 5;
        } else if(loai.equals("TT")){
            heSo = 4;
        } else {
            heSo = 2;
        }
        this.thanhTien = (chiSoMoi - chiSoCu) * heSo * 550;
        if(chiSoMoi - chiSoCu < 50){
            phuTroi = 0;
        } else if(chiSoMoi - chiSoCu <= 100){
            phuTroi = (int) Math.ceil(thanhTien * 0.35);
        } else {
            phuTroi = (int) Math.ceil(thanhTien * 1.0);
        }
        this.tong = thanhTien + phuTroi;
    }

    @Override
    public String toString() {
        return ma + " " + heSo + " " + thanhTien + " " + phuTroi + " " + tong;
    }
    
}
