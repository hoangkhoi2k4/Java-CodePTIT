
package object.j05034_danhSachThucTap_1;


public class Student implements Comparable<Student> {
    private int order;
    private String id, name, classId, email, company;

    public Student(int order, String id, String name, String classId, String email, String company) {
        this.order = order;
        this.id = id.trim();
        this.name = name.trim();
        this.classId = classId.trim();
        this.email = email;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
    
    

    @Override
    public String toString() {
        return order + " " +
                id + " " + 
                name + " " + 
                classId + " " +
                email + " " +
                company;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
