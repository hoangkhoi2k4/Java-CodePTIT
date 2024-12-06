
package object.j05025_sapXepDanhSachGiangVien;


public class Lecturer implements Comparable<Lecturer> {
    private String id, fisrtName, lastName, subject;

    public Lecturer(String id, String name, String subject) {
        this.id = id;
        String[] w = name.split("\\s+");
        this.fisrtName = w[w.length-1];
        this.lastName = "";
        for(int i = 0; i < w.length-1; i++) {
            this.lastName += w[i] + " ";
        }
        this.subject = "";
        for(String s : subject.split("\\s+")) {
            this.subject += s.substring(0, 1).toUpperCase();
        }
        
    }

    @Override
    public String toString() {
        return id + " " +
                lastName + 
                fisrtName + " " + 
                subject;
    }

    @Override
    public int compareTo(Lecturer o) {
        if(this.fisrtName.equals(o.fisrtName)) {
            return this.id.compareTo(o.id);
        }
        return this.fisrtName.compareTo(o.fisrtName);
    }
}
