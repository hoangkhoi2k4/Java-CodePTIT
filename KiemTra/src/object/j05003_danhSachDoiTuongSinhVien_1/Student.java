
package object.j05003_danhSachDoiTuongSinhVien_1;

public class Student {
    private String id, name, dob, classId;
    private double gpa;

    public Student() {
        this.id = "";
        this.name = "";
        this.dob = "";
        this.classId = "";
        this.gpa = 0.0;
    }

    public Student(String id, String name, String classId, String dob, double gpa) {
        this.id = id;
        this.name = name;
        this.dob = convert(dob);
        this.classId = classId;
        this.gpa = gpa;
    }
    
    private String convert(String dob) {
        String[] s = dob.split("/");
        return String.format("%02d/%02d/%04d", 
                Integer.parseInt(s[0]),
                Integer.parseInt(s[1]),
                Integer.parseInt(s[2]));
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " + 
                classId + " " + 
                dob + " " + 
                String.format("%.2f", gpa);
    }
}
