
package object.j05021_sapXepTheoMaSinhVien;


public class Student implements Comparable<Student> {
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
        return this.id.compareTo(o.id);
    }
    
    
}
