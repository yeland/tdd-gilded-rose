package cn.xpbootcamp.gildedrose;

public class BackstagePass {
    private int sellIn;
    private int quantity;

    public BackstagePass(int sellIn, int quantity) {
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
        if (sellIn <= 10) {
            quantity ++;
        }
        if (sellIn < 5) {
            quantity ++;
        }
        quantity = Math.min(50, quantity);
    }
}
