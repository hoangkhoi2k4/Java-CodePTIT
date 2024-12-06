
package object.j04005_khaiBaoLopThiSinh;


public class Contestant {
    private String name, dob;
    private double s1, s2, s3;

    public Contestant(String name, String dob, double s1, double s2, double s3) {
        this.name = name;
        this.dob = dob;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return name + " " +
                dob + " " + 
                String.format("%.1f", s1 + s2 + s3);
    }
}
