
package object.j05009_timThuKhoaCuaKiThi;


public class Contestant implements Comparable<Contestant> {
    private String id, name, dob;
    private double total;

    public Contestant(String id, String name, String dob, double s1, double  s2, double s3) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.total = s1 + s2 + s3;
    }

    public double getTotal() {
        return total;
    }
    

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                dob + " " + 
                String.format("%.1f", total);
    }

    @Override
    public int compareTo(Contestant o) {
        return Double.compare(o.total, this.total);
    }
    
}
