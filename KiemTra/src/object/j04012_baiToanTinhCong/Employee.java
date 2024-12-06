
package object.j04012_baiToanTinhCong;


public class Employee {
    private String id, name, role;
    private int basicSalary, dayCount;

    public Employee(String id, String name,int basicSalary, int dayCount, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.basicSalary = basicSalary;
        this.dayCount = dayCount;
    }

    @Override
    public String toString() {
        int salary = dayCount * basicSalary;
        int bonus = 0; 
        if(dayCount >= 25) {
            bonus = (int)(0.2 * salary);
        } else if(dayCount >= 22) {
            bonus = (int)(0.1 * salary);
        } 
        int add;
        switch (role) {
            case "GD":
                add = 250000;
                break;
            case "PGD":
                add = 200000;
                break;
            case "TP":
                add = 180000;
                break;
            default:
                add = 150000;
        }
        return id + " " + 
                name + " " + 
                salary + " " + 
                bonus + " " + 
                add + " " + 
                (salary + bonus + add);
                
    }
}
