/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyXau;
import java.util.regex.*;
/**
 *
 * @author Hoang Van Khoi
 */
class Xau {
    public boolean isCodeValid(String x){
        String regex = "^[Bb]\\d{2}(DC|dc)(CN|cn|AT|at)\\d{3}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(x);
        
        return m.matches();
    }
    
    public boolean isBillCode(String x){
        String regex = "^[NnXx]\\d{2}(PTIT|ptit)\\d{2,4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(x);
        
        return m.matches();
    }
}
