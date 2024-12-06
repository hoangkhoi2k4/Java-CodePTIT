
package object.j05029_danhSachDoanhNghiepNhanSinhVienThucTap_2;


public class Company implements Comparable<Company> {
    private String id, name;
    private int numberOfStudents;

    public Company(String id, String name, int numberOfStudents) {
        this.id = id;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " +
                numberOfStudents;
    }

    @Override
    public int compareTo(Company o) {
        if(this.numberOfStudents != o.numberOfStudents) {
            return Integer.compare(o.numberOfStudents, this.numberOfStudents);
        }
        return this.id.compareTo(o.id);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
