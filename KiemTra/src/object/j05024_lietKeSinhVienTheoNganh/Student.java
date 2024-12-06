
package object.j05024_lietKeSinhVienTheoNganh;


public class Student {
    private String id, name, classId, email;

    public Student(String id, String name, String classId, String email) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classId + " " + email;
    }
    
    
}
