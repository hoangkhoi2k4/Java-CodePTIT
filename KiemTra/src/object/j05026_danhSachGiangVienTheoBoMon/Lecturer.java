
package object.j05026_danhSachGiangVienTheoBoMon;


public class Lecturer {
    private String id, name , subject;

    public Lecturer(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                subject;
    }

    public String getSubject() {
        return subject;
    }
    
    
}
