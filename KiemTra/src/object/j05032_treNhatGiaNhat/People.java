
package object.j05032_treNhatGiaNhat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class People implements Comparable<People> {
    private String name;
    private LocalDate dob;

    public People(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(People o) {
        return this.dob.compareTo(o.dob);
    }
}
