
package object.j04015_tinhThuNhapGiaoVien;


public class Teacher {
    private String id, name;
    private int salary, level, addition;

    public Teacher(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        
        this.level = Integer.parseInt(id.substring(2));
        switch (id.substring(0, 2)) {
            case "HT":
                this.addition = 2000000;
                break;
            case "HP":
                this.addition = 900000;
                break;
            default:
                this.addition = 500000;
        }
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                level + " " + 
                addition + " " + 
                (salary * level + addition);
    }
}
