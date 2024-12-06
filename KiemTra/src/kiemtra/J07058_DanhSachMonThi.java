package kiemtra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

class MonHoc implements Comparable<MonHoc> {
    private String ma;
    private String ten;
    private String ht;

    public MonHoc(String ma, String ten, String ht) {
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }

    @Override
    public int compareTo(MonHoc a) {
        return this.ma.compareTo(a.ma);
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.ht;
    }
}

public class J07058_DanhSachMonThi {
    public static void main(String[] agrs) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for (MonHoc a : arr) {
            System.out.println(a);
        }
    }
}