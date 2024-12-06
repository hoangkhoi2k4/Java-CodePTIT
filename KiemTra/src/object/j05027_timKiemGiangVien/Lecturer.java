
package object.j05027_timKiemGiangVien;


public class Lecturer {
    private String id, name, subject;

    public Lecturer(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = "";
        for(String w : subject.split("\\s+")) {
            this.subject += w.substring(0, 1).toUpperCase();
        }
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                subject;
    }

    public String getName() {
        return name;
    }
}
