
package object.j05010_sapXepDanhSachMatHang;


public class Item implements Comparable<Item> {
    private int id;
    private String name, type;
    private double profit;

    public Item(int id, String name, String type, double buy, double sell) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.profit = sell - buy;
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " +
                type + " " +
                String.format("%.2f", profit);
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(o.profit, this.profit);
    }
}
