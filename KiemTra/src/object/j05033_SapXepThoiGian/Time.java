
package object.j05033_SapXepThoiGian;


public class Time implements Comparable<Time> {
    private int hour, minutes, second;

    public Time(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + " " + minutes + " " + second;
    }

    @Override
    public int compareTo(Time o) {
        if(this.hour == o.hour) {
            if(this.minutes == o.minutes) {
                return this.second - o.second;
            }
            return this.minutes - o.minutes;
        }
        return this.hour - o.hour;
    }
}
