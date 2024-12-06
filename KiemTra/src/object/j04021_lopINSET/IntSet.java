
package object.j04021_lopINSET;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collector;


public class IntSet {
    private TreeSet<Integer> set;

    public IntSet(int[] arr) {
        set = new TreeSet<>();
        for(int e : arr) {
            set.add(e);
        }
    }

    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }
    
    public IntSet union(IntSet other) {
        TreeSet<Integer> res = new TreeSet<>();
        res.addAll(this.set);
        res.addAll(other.set);
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(int e : set) {
            res += e + " ";
        }
        return res;
    }
}
