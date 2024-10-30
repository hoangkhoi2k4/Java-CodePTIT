/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TongDaThuc;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Hoang Van Khoi
 */

class map{
    private int first, second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    
    public map(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public map() {
        this.first = 0;
        this.second = 0;
    }
    
}

class DaThuc {
    private List<map> m;

    public DaThuc(String input) {
        m = new ArrayList<>();
        input = input.replace(" ", "");
        
        Pattern pattern = Pattern.compile("([+-]?\\d+)\\*x\\^(\\d+)|([+-]?\\d+)");
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            map a = new  map();
            if (matcher.group(1) != null) { 
                a.setSecond(Integer.parseInt(matcher.group(1)));
                a.setFirst(Integer.parseInt(matcher.group(2)));
                
            } else { 
                a = new map(0, Integer.parseInt(matcher.group(3)));
            }
            m.add(a);
        }
    }
    
    public DaThuc cong(DaThuc q) {
        DaThuc res = new DaThuc("");  
        List<map> combined = new ArrayList<>(this.m);  
        
        for (map termQ : q.m) {
            boolean found = false;
            for (map termRes : combined) {
                if (termRes.getFirst() == termQ.getFirst()) {  
                    termRes.setSecond(termRes.getSecond() + termQ.getSecond());  
                    found = true;
                    break;
                }
            }
            if (!found) {
                combined.add(termQ);  
            }
        }

        combined.sort((a, b) -> Integer.compare(b.getFirst(), a.getFirst()));

        res.m = combined;
        return res;
    }


    @Override
    public String toString() {
        String res = "";
        for(map x : m){
            res = res + String.valueOf(x.getSecond()) + "*x^" + String.valueOf(x.getFirst()) + " + ";
        }
        res = res.substring(0, res.length() - 3);
        return res; 
    }
    
}
