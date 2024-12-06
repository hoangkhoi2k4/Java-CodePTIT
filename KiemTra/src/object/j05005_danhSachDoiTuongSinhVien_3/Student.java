
package object.j05005_danhSachDoiTuongSinhVien_3;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Student implements Comparable<Student> {
    private String id, name, classId, dob;
    private double gpa;

    public Student(String id, String name, String classId, String dob, double gpa) {
        this.id = id;
        this.name = nameConvert(name);
        this.classId = classId;
        this.dob = dateConvert(dob);
        this.gpa = gpa;
    }
    
    private String dateConvert(String s) {
        String[] w = s.trim().split("/");
        return String.format("%02d/%02d/%d", 
                Integer.parseInt(w[0]),
                Integer.parseInt(w[1]),
                Integer.parseInt(w[2]));
    }
    
    private String nameConvert(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " +
                classId + " " + 
                dob + " " +
                String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.gpa, this.gpa);
    }
}
