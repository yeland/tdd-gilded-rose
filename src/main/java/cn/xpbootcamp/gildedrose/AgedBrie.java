package cn.xpbootcamp.gildedrose;

public class AgedBrie {
    private int sellIn;
    private int quantity;

    public AgedBrie(int sellIn, int quantity) {
        this.sellIn = sellIn;
        this.quantity = quantity;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void passOneDay() {
        sellIn --;
        quantity ++;
        if (sellIn <= 0) {
            quantity ++;
        }
    }
}
