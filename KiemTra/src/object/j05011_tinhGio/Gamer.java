
package object.j05011_tinhGio;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Gamer implements Comparable<Gamer>{
    private String id, name;
    private long min;

    public Gamer(String id, String name, String start, String end) {
        this.id = id;
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime s = LocalTime.parse(start, formatter);
        LocalTime e = LocalTime.parse(end, formatter);
        this.min = Duration.between(s, e).toMinutes();
    }

    @Override
    public String toString() {
        return id + "  " + 
                name + " " + 
                String.format("%d gio %d phut", min/60, min%60);
    }

    @Override
    public int compareTo(Gamer o) {
        return Long.compare(o.min, this.min);
    }
}
