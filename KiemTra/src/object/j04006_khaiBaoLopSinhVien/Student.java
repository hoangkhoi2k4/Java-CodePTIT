
package object.j04006_khaiBaoLopSinhVien;


public class Student {
    private String id, name, classId, dob;
    private double gpa;

    public Student(String name, String classId, String dob, double gpa) {
        this.id = "B20DCCN001";
        this.name = name;
        this.classId = classId;
        this.dob = dob;
        this.gpa = gpa;
        formatDob();
    }
    
    private void formatDob() {
        String[] s = this.dob.split("/");
        this.dob = String.format("%02d/%02d/%d", 
                Integer.parseInt(s[0]),
                Integer.parseInt(s[1]),
                Integer.parseInt(s[2])
        );
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
