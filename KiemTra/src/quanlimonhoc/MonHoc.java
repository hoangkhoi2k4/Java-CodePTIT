
package quanlimonhoc;

import java.io.Serializable;

public class MonHoc implements Serializable{
    private String ma, TenMon;
    private int soTin;
    private String loaiMon;

    public MonHoc() {
    }

    public MonHoc(String ma, String TenMon, int soTin, String loaiMon) {
        this.ma = ma;
        this.TenMon = TenMon;
        this.soTin = soTin;
        this.loaiMon = loaiMon;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }

    public String getLoaiMon() {
        return loaiMon;
    }

    public void setLoaiMon(String loaiMon) {
        this.loaiMon = loaiMon;
    }
    public Object[] toObject() {
        return new Object[]{
            ma, TenMon, soTin, loaiMon
        };
    }
}
