/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachCaThi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CaThi implements Comparable<CaThi> {

    private String ma;
    private String ngay;
    private String gio;
    private int phong;
    private LocalDateTime now;

    public CaThi(int ma, String ngay, String gio, int phong) {
        this.ma = String.format("C%03d", ma);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
        StringBuilder builder = new StringBuilder();
        builder.append(ngay).append(" ").append(gio);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.now = LocalDateTime.parse(builder.toString().trim(), dtf);
    }

    @Override
    public int compareTo(CaThi o) {
        return this.now.compareTo(o.now);
    }

    @Override
    public String toString() {
        return ma + " " + ngay + " " + gio + " " + phong;
    }
}
