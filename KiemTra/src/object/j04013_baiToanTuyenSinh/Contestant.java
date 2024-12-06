
package object.j04013_baiToanTuyenSinh;


public class Contestant {
    private String id, name, result;
    private double prio, total;

    public Contestant(String id, String name, double math, double physic, double ches) {
        this.id = id;
        this.name = name;
        
        String area = id.substring(0, 3);
        if(area.equals("KV1")) {
            this.prio = 0.5;
        } else if(area.equals("KV2")) {
            this.prio = 1.0;
        } else {
            this.prio = 2.5;
        }
        
        this.total = math * 2 + physic + ches;
        if(this.total + this.prio >= 24) {
            this.result = "TRUNG TUYEN";
        } else {
            this.result = "TRUOT";
        }
    }
    
    private String convert(double a) {
        if(a == (int)a) {
            return (int)a + "";
        } else {
            return String.format("%.1f", a);
        }
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " + 
                convert(prio) + " " + 
                convert(total) + " " + 
                result;
    }
}
