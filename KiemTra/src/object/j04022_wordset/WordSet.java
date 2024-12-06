
package object.j04022_wordset;

import java.util.TreeSet;


public class WordSet {
    private TreeSet<String> words;
    public WordSet(String src) {
        this.words = new TreeSet<>();
        String[] w = src.trim().split("\\s+");
        for(String e : w) {
            this.words.add(e.toLowerCase());
        }
    }
    
    public WordSet(TreeSet<String> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String e : words) {
            sb.append(e + " ");
        }
        return sb.toString();
    }
    
    public WordSet union(WordSet other) {
        TreeSet<String> set = new TreeSet<>();
        set.addAll(this.words);
        set.addAll(other.words);
        return new WordSet(set);
    }
    
    public WordSet intersection(WordSet other) {
        TreeSet<String> set = new TreeSet<>();
        for(String e : this.words) {
            if(other.words.contains(e)) {
                set.add(e);
            }
        }
        return new WordSet(set);
    }
}
