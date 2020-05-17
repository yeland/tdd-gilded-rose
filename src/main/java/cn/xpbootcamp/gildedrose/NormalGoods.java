package cn.xpbootcamp.gildedrose;

public class NormalGoods {
    private int sellIn;
    private int quantity;

    public NormalGoods(int sellIn, int quantity) {
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
        quantity --;
    }
}
