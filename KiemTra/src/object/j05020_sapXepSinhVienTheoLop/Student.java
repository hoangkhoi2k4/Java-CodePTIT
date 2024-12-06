
package object.j05020_sapXepSinhVienTheoLop;


public class Student implements Comparable<Student>{
    private String id, name, classId, email;

    public Student(String id, String name, String classId, String email) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                classId + " " + 
                email;
    }

    @Override
    public int compareTo(Student o) {
        if(this.classId.equals(o.classId)) {
            return this.id.compareTo(o.id);
        }
        return this.classId.compareTo(o.classId);
    }
}
