
package object.j05006_danhSachDoiTuongNhanVien;


public class Employee {
    private String id, name, gender, dob, address, taxCode, signedDate;

    public Employee(String id, String name, String gender, String dob, String address, String taxCode, String signedDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.signedDate = signedDate;
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                gender + " " + 
                dob + " " + 
                address + " " + 
                taxCode + " " + 
                signedDate;
    }
}
