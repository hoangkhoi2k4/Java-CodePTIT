
package object.j05031_bangDiemThanhPhan_2;


public class Student implements Comparable<Student> {
    private String id, name, classId;
    private double s1, s2, s3;

    public Student(String id, String name, String classId, double s1, double s2, double s3) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                classId + " " +
                String.format("%.1f %.1f %.1f", s1, s2, s3);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
