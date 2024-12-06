
package object.j05007_sapXepDanhSachDoiTuongNhanVien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee implements Comparable<Employee> {
    private String id, name, gender, address, taxCode, signedDate;
    private LocalDate dob;

    public Employee(String id, String name, String gender, String dob, String address, String taxCode, String signedDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.taxCode = taxCode;
        this.signedDate = signedDate;
        this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                gender + " " +
                dob.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + 
                address + " " + 
                taxCode + " " + 
                signedDate;
    }

    @Override
    public int compareTo(Employee o) {
        return this.dob.compareTo(o.dob);
    }
}
