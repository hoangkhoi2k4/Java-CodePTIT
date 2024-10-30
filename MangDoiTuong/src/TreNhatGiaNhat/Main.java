/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreNhatGiaNhat;
import java.util.*;

/**
 *
 * @author Hoang Van Khoi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            a.add(new Person(sc.next(), sc.next()));
        }
       
        Collections.sort(a, new Comparator<Person>(){
            @Override
            public int compare(Person x, Person y){
                long tuoi1 = x.getTuoi();
                long tuoi2 = y.getTuoi();
                
                return Long.compare(tuoi1, tuoi2);
            }
        });

        System.out.println(a.get(a.size() - 1).getName()); 
        System.out.println(a.get(0).getName()); 
    }
}

//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990
