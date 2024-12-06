
package object.j05018_bangDiemHocSinh;


public class Student implements Comparable<Student> {
    private String id, name, rank;
    private double avg;

    public Student(String id, String name, double[] s) {
        this.id = id;
        this.name = name;
        double sum = s[0] * 2 + s[1] * 2;
        for(int i = 2; i < 10; i++) {
            sum += s[i];
        }
        this.avg = Math.round(sum / 12 * 10) / 10.0;
        if(avg >= 9) {
            rank = "XUAT SAC";
        } else if(avg >= 8) {
            rank = "GIOI";
        } else if(avg >= 7) {
            rank = "KHA";
        } else if(avg >= 5) {
            rank = "TB";
        } else {
            rank = "YEU";
        }
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                String.format("%.1f", avg) + " " +
                rank;
    }

    @Override
    public int compareTo(Student o) {
        if(this.avg != o.avg) {
            return Double.compare(o.avg, this.avg);
        }
        return this.id.compareTo(o.id);
    }
}
