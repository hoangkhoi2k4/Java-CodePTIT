
package object.j05081_danhSachMatHang;


public class Item implements Comparable<Item> {
    private String id, name, unit;
    private int buyPrice, sellPrice, profit;

    public Item(String id, String name, String unit, int buyPrice, int sellPrice) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - buyPrice;
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                unit + " " + 
                buyPrice + " " + 
                sellPrice + " " + 
                profit;
    }

    @Override
    public int compareTo(Item o) {
        if(this.profit == o.profit) {
            return this.id.compareTo(o.id);
        }
        return o.profit - this.profit;
    }
}
